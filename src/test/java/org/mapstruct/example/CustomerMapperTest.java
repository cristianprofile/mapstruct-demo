/**
 * Copyright 2012-2017 Gunnar Morling (http://www.gunnarmorling.de/)
 * and/or other contributors as indicated by the @authors tag. See the
 * copyright.txt file in the distribution for a full listing of all
 * contributors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mapstruct.example;

import org.junit.Test;
import org.mapstruct.example.dto.*;
import org.mapstruct.example.mapper.CustomerMapper;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.tuple;

/**
 * @author Filip Hrisafov
 */
public class CustomerMapperTest {

  @Test
  public void testMapDtoToEntity() {

	CustomerDto customerDto = new CustomerDto();
	customerDto.setId(10L);
	customerDto.setCustomerName("Filip");
	customerDto.setSurname("romero");

	OrderItemDto order1 = new OrderItemDto();
	order1.setName("Table");
	order1.setQuantity(2L);
	ArrayList<OrderItemDto> objects = new ArrayList<OrderItemDto>();
	objects.add(order1);
	customerDto.setOrders(objects);

	Customer customer = CustomerMapper.MAPPER.toCustomer(customerDto);

	assertThat(customer.getId()).isEqualTo(10);
	assertThat(customer.getName()).isEqualTo("Filip");
	assertThat(customer.getOrderItems()).extracting("name", "quantity").containsExactly(tuple("Table", 2L));

	assertThat(customer).hasFieldOrPropertyWithValue("surname", "romero");
  }

  @Test
  public void testEntityDtoToDto() {

	Customer customer = new Customer();
	customer.setId(10L);
	customer.setName("Filip");
	customer.setSurname("romero");
	customer.setUserStatus(UserStatus.ACTIVE);
	OrderItem order1 = new OrderItem();
	order1.setName("Table");
	order1.setQuantity(2L);
	customer.setOrderItems(Collections.singleton(order1));

	CustomerDto customerDto = CustomerMapper.MAPPER.fromCustomer(customer);

	assertThat(customerDto.id).isEqualTo(10);
	assertThat(customerDto.customerName).isEqualTo("Filip");
	assertThat(customerDto.surname).isEqualTo("romero");
	assertThat(customerDto.orders).extracting("name", "quantity").containsExactly(tuple("Table", 2L));
  }
}

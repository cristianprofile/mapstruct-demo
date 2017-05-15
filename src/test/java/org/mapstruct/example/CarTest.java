package org.mapstruct.example;

import org.junit.Test;
import org.mapstruct.example.dto.Brake;
import org.mapstruct.example.dto.Car;
import org.mapstruct.example.dto.CarDto;
import org.mapstruct.example.mapper.CarMapper;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by SE05357 on 08/05/2017.
 */
public class CarTest {

  @Test
  public void shouldMapCarToDto() {
	//given
	Car car = new Car();
	car.setMake("Morris");
	car.setNumberOfSeats(5);
	car.setSurmane("romero");
	car.setIgnoreProperty("ignoreProperty");
	Brake brake = new Brake();
	brake.setId(1);
	brake.setName("pepe");
	car.setBrake(brake);

	//when
	CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

	//then
	assertThat(carDto).isNotNull();
	assertThat(carDto.getMake()).isEqualTo("Morris");
	assertThat(carDto.getSeatCount()).isEqualTo(5);
	assertThat(carDto.getSurmane()).isEqualTo("romero");
	assertThat(carDto.getIgnoreProperty()).isNull();
	assertThat(carDto.getBrakeName()).isEqualTo(brake.toString());

	Car car1 = CarMapper.INSTANCE.carDtoToCar(carDto);

	assertThat(car1).isNotNull();
	assertThat(car1.getMake()).isEqualTo("Morris");
	assertThat(car1.getNumberOfSeats()).isEqualTo(5);
	assertThat(car1.getSurmane()).isEqualTo("romero");
	assertThat(car1.getIgnoreProperty()).isNull();
	assertThat(car1.getBrake().getName()).isEqualTo(brake.toString());
	assertThat(car1.getBrake().getId()).isNull();


//	assertThat( carDto.getType() ).isEqualTo( "SEDAN" );
  }

}

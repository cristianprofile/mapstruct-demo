package org.mapstruct.example.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.example.converter.CarConverters;
import org.mapstruct.example.dto.Car;
import org.mapstruct.example.dto.CarDto;
import org.mapstruct.factory.Mappers;

/**
 * Created by SE05357 on 08/05/2017.
 */
@Mapper(uses = {CarConverters.class})
public interface CarMapper {

  CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

  @Mappings({@Mapping(source = "numberOfSeats", target = "seatCount"),
    @Mapping(source = "ignoreProperty", target = "ignoreProperty", ignore = true),
    @Mapping(source = "brake", target = "brakeName")})
  CarDto carToCarDto(Car car);


  @InheritInverseConfiguration
  Car carDtoToCar(CarDto car);
}

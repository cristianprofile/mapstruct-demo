package org.mapstruct.example.mapper;

import org.mapstruct.*;
import org.mapstruct.example.converter.CarConverters;
import org.mapstruct.example.decorator.CarMapperDecorator;
import org.mapstruct.example.dto.Car;
import org.mapstruct.example.dto.CarDto;
import org.mapstruct.factory.Mappers;


@Mapper(uses = {CarConverters.class})
@DecoratedWith(CarMapperDecorator.class)
public interface CarMapper {

  CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

  @Mappings({@Mapping(source = "numberOfSeats", target = "seatCount"),
    @Mapping(source = "ignoreProperty", target = "ignoreProperty", ignore = true),
    @Mapping(source = "brake", target = "brakeName")})
  CarDto carToCarDto(Car car);


  @InheritInverseConfiguration
  Car carDtoToCar(CarDto car);
}

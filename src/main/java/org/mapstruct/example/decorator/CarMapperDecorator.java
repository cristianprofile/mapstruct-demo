package org.mapstruct.example.decorator;


import org.mapstruct.example.dto.Car;
import org.mapstruct.example.dto.CarDto;
import org.mapstruct.example.mapper.CarMapper;

public abstract class CarMapperDecorator implements CarMapper {
  private final CarMapper delegate;

  public CarMapperDecorator(CarMapper delegate) {
	this.delegate = delegate;
  }

  @Override
  public CarDto carToCarDto(Car car) {
	CarDto dto = delegate.carToCarDto(car);
	// do whate ever you want to decorate your bean
	System.out.println("mapper decorator:"+car.getSurnane());
	return dto;
  }
}

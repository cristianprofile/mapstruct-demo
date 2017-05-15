package org.mapstruct.example.converter;

import org.mapstruct.example.dto.Brake;


public class CarConverters {
  public String asString(Brake brake) {
	return brake!=null && brake.getName() != null && brake.getId()!=null  ? brake.toString() : null;
  }


  public Brake asBrake(String brake) {
	Brake brake1 = new Brake();
	brake1.setName(brake!=null   ? brake.toString() : null);
	return brake1;
  }



}


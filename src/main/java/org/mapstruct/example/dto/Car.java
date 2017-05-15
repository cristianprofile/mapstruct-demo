package org.mapstruct.example.dto;

/**
 * Created by SE05357 on 08/05/2017.
 */
public class Car {

  private String make;
  private String surmane;
  private String ignoreProperty;
  private int numberOfSeats;
  private Brake brake;


  public Brake getBrake() {
	return brake;
  }

  public void setBrake(Brake brake) {
	this.brake = brake;
  }

  public String getIgnoreProperty() {
	return ignoreProperty;
  }

  public void setIgnoreProperty(String ignoreProperty) {
	this.ignoreProperty = ignoreProperty;
  }

  public String getSurmane() {
	return surmane;
  }

  public void setSurmane(String surmane) {
	this.surmane = surmane;
  }

  public String getMake() {
	return make;
  }

  public void setMake(String make) {
	this.make = make;
  }

  public int getNumberOfSeats() {
	return numberOfSeats;
  }

  public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
  }


  //constructor, getters, setters etc.
}

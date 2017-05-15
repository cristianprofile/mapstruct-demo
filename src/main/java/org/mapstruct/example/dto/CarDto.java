package org.mapstruct.example.dto;

/**
 * Created by SE05357 on 08/05/2017.
 */
public class CarDto {

  private String make;
  private int seatCount;

  private String surmane;
  private String ignoreProperty;
  private String brakeName;

//  private String type;

  //constructor, getters, setters etc.


  public String getBrakeName() {
	return brakeName;
  }

  public void setBrakeName(String brakeName) {
	this.brakeName = brakeName;
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

  public int getSeatCount() {
	return seatCount;
  }

  public void setSeatCount(int seatCount) {
	this.seatCount = seatCount;
  }
}
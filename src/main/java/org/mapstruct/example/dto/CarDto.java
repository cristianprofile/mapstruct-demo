package org.mapstruct.example.dto;

public class CarDto {

  private String make;
  private int seatCount;
  private String surnane;
  private String ignoreProperty;
  private String brakeName;


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

    public String getSurnane() {
        return surnane;
    }

    public void setSurnane(String surnane) {
        this.surnane = surnane;
    }

    public String getIgnoreProperty() {
        return ignoreProperty;
    }

    public void setIgnoreProperty(String ignoreProperty) {
        this.ignoreProperty = ignoreProperty;
    }

    public String getBrakeName() {
        return brakeName;
    }

    public void setBrakeName(String brakeName) {
        this.brakeName = brakeName;
    }
}
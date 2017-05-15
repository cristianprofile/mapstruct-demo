package org.mapstruct.example.dto;

public class Car {

  private String make;
  private String surnane;
  private String ignoreProperty;
  private int numberOfSeats;
  private Brake brake;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }
}

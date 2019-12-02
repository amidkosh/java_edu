package Parking;

import java.util.HashMap;
import java.util.Map;

public class Car {
    private int year;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }


}

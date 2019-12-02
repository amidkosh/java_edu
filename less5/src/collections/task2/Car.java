package collections.task2;

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

    public static void main(String[] args) {

//        5 floors
//        20 places

        Map<Integer, Map<Integer, Car>> floor = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            Map<Integer, Car> places = new HashMap<>();
            for (int j = 1; j < 21; j++) {
                double f = Math.random() * 10;
                places.put(j, new Car((int) f + 2010, "car" + j + " on " + i + " floor"));
            }
            floor.put(i, places);
        }

        for (Map.Entry<Integer, Map<Integer, Car>> el : floor.entrySet()) {
            System.out.println("\n" + el.getKey() + "\n");

            Map<Integer, Car> f = floor.get(el.getKey());
            for (Map.Entry<Integer, Car> m : f.entrySet()) {
                System.out.println(m.getValue());

            }
        }
    }
}

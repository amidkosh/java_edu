package Parking;

import java.util.*;
import java.util.stream.Collectors;

public class Parking {
    public static void main(String[] args) {

        Map<Integer, Map<Integer, Car>> parking = generateParking();
        parking.entrySet().stream().forEach(System.out::println);
        List<Car> cars = new ArrayList<Car>();
        parking.values().forEach(m->cars.addAll(m.values()));

//        parking.entrySet().stream().
//                filter(floor -> floor.getValue().values().stream()
//                        .filter(car -> car.getYear() > 2017).count()>2
//        ).collect(Collectors.toList());
        System.out.println("-------");
        List<Car> nCars = cars.stream().filter(c->c.getYear()>2017).collect(Collectors.toList());
//        System.out.println(nCars.);
        nCars.forEach(car-> System.out.println(car));
        System.out.println("-------");
        parking.entrySet().stream().forEach(System.out::println);

    }

    private static Map<Integer, Map<Integer, Car>> generateParking() {
        Map<Integer, Map<Integer, Car>> floor = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            Map<Integer, Car> places = new HashMap<>();
            for (int j = 1; j < 21; j++) {
                double f = Math.random() * 10;
                places.put(j, new Car((int) f + 2010, "car" + j + " on " + i + " floor"));
            }
            floor.put(i, places);
        }
        return floor;

    }
}

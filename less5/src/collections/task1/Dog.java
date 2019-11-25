package collections.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.spi.LocaleServiceProvider;

public class Dog {
    private int age;
    private String name;
    private boolean hasTail;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hasTail=" + hasTail +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public Dog(int age, String name, boolean hasTail) {
        this.age = age;
        this.name = name;
        this.hasTail = hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public static void main(String[] args) {


        ArrayList<Dog> list = new ArrayList<>(Arrays.asList(
                new Dog(5, "Blala", true),
                new Dog(8, "Otis", true),
                new Dog(2, "Jeci", false),
                new Dog(8, "Fake", true),
                new Dog(2, "Truta", false),
                new Dog(15, "Dona", true)
        ));
        Comparator<Dog> comparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return Integer.compare(o2.getAge(), o1.getAge()) * -1;
            }
        };
        list.sort(comparator);
        for (Dog e: list){
            System.out.println(e);
        }
        Iterator<Dog> it = list.iterator();
        System.out.println("\n--------\n");
        LocalDate l = LocalDate.now();
        while (it.hasNext()){
            if(!it.next().isHasTail()){
                it.remove();
            }
        }
//        System.out.println(LocalDate.now().mi);
        for (Dog e: list){
            System.out.println(e);
        }
    }
}

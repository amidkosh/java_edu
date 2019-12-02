package creational.abstract_factory.banking;

import creational.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes JAVA code...");
    }
}

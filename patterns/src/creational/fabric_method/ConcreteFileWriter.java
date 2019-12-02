package creational.fabric_method;

public class ConcreteFileWriter extends AbstractWriter{
    @Override
    public void write(Object context) {
        System.out.println("Writing in file...");
    }
}

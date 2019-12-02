package creational.fabric_method;

public class ConcreteXMLWriter extends AbstractWriter{
    @Override
    public void write(Object context) {
        System.out.println("Writing in XML file...");
    }
}

package creational.fabric_method;

import org.w3c.dom.Document;
import java.io.File;

public class FactoryMethod {
    public AbstractWriter getWriter(Object object){
        AbstractWriter writer = null;
        if (object instanceof File) {
            writer = new ConcreteFileWriter();
        } else if (object instanceof Document){
            writer = new ConcreteXMLWriter();
        }
        return writer;
    }
}

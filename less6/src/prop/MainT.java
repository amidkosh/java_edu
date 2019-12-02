package prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class MainT {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/user1/Java/Edu/less6/src/prop/config.properties"));
        prop.getProperty("another", "nothing");
        System.out.println(prop.getProperty("something"));
    }
}

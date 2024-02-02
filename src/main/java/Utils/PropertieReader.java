package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertieReader {
    static Properties p =null;

    public static String FileReader(String key) throws Exception {
        String dir = System.getProperty("user.dir");

        FileInputStream file = new FileInputStream(new File(dir) + "/src/main/resources/Data.properties");
        p = new Properties();
        p.load(file);

        return p.getProperty(key);
    }


    }





package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

private static String configFolderPath = "/Users/vaibhavsingh/Documents/Testometer-Dec-Project/config/";
public static Properties readConfigProperties(String fileName )throws IOException {
    Properties returnProp = new Properties();
    returnProp.load(new FileInputStream(
            new File(configFolderPath + fileName + ".properties")));
    return returnProp;
}

}

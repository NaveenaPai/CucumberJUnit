package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Level;

import factory.DriverFactory;

public class ConfigReader extends DriverFactory {

	public static Properties prop;
	public static String value;

	public static String getPropertyValue(String key) {

		prop = new Properties();

		try {
			FileInputStream propFile = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources" + "/config.properties");
			prop.load(propFile);

			value = prop.getProperty(key);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			logger.log(Level.FATAL, "Exception Occured "+e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			logger.log(Level.FATAL, "Exception Occured "+e.getMessage());
		}

		return value;

	}
}

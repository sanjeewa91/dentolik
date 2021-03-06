package ie.exactest.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
 
public class Configurations {
	
	InputStream inputStream;
 
	public String getPropValues(String key) throws IOException {
		String value=null;
		try {
			Properties prop = new Properties();
			String propFileName = "configs/config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			
			value = prop.getProperty(key);
			
 
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return value;
	}
}
package General_utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Property_utility {
	/**
	 * this method is used to login the application
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getkeyvalue(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/property_file.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String Value = pro.getProperty(key);
		return Value;
		
	}

}

package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtility {
	public static String logindata(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\ConfigureFile\\LogInFunction.Properties");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}

}
  

package warmUp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ConfigLoader {

	// String url = ConfigLoader.getMyValue("a key in here") ; 
	// driver.get(url) ; 

	private static Properties prop;
	
	static {
		prop = new Properties();
		try {
			FileInputStream input = new FileInputStream("config.properties");
			prop.load(input);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static String getMyValue(String key) {
	
		String value = prop.getProperty(key);
		
		return value;
	}
		
}





// Set<Entry<Object,Object>>entry2 = prop.entrySet();
//	
//	for (Entry<Object, Object> each : entry2) {
//		System.out.println(each.getKey() + "=" + each.getValue());
//		
//	}




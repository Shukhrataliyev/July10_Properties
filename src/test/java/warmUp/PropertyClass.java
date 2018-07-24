package warmUp;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertyClass {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("Adam1", "123");
		prop.setProperty("Adam2", "124");
		prop.setProperty("Adam3", "125");
		
		prop.setProperty("Adam1", "123");
		prop.setProperty("Adam2", "124");
		prop.setProperty("Adam3", "125");
		
		System.out.println(prop);
		System.out.println(prop.getProperty("Adam2"));
		
		Set<Entry<Object, Object>> entries = prop.entrySet();
	    for (Entry<Object, Object> entry : entries) {
	      System.out.println(entry.getKey() + " : " + entry.getValue());
	    }
		
		
		
		
		
		
	}

}

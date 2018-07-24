package warmUp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WarmUp {

	public static void main(String[] args) {
		
	
		Map<Integer, String> hMap = new HashMap();
		hMap.put(1,"Adam");
		hMap.put(2,"John");
		hMap.put(3,"asd");
		hMap.put(4,"dfg");
		hMap.put(5,"dfgd");
	
	Set<Entry<Integer, String>> entries = hMap.entrySet();
	
	for(Entry<Integer, String> each : entries) {
		System.out.println(each.getKey());
		System.out.println(each.getValue());
		
	}
	
	
	}
	
}

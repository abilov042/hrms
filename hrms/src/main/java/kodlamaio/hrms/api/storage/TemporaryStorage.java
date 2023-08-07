package kodlamaio.hrms.api.storage;

import java.util.HashMap;
import java.util.Map;

public class TemporaryStorage {
	private static Map<String, Object> dataMap = new HashMap<>();
	
	public static void saveData(String key, Object value) {
		dataMap.put(key, value);
	}
	
	public static Object getData(String key) {
		
		return dataMap.get(key);
	}
	
	public static void removeData(String key) {
		dataMap.remove(key);
	}
}

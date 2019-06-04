package helloworldgit;

import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello world to the standard out");
		
		HashMap<String, String> map = new HashMap<>();
		
		addToMap(map, "a", "b");
		
		System.out.println(getFromMap(map, "a"));
	}
	
	public static void addToMap(Map<String, String> m, String a, String b) {
		m.put(a, b);
	}
	
	
	public static String getFromMap(Map<String, String> m, String a) {
		return m.get(a);
	}
}

package week14;

import java.util.*;

public class Lab14a {

	public static void main(String[] args) {
		// Create HashMap
		HashMap<String, String> list = new HashMap<String, String>();
		
		// Write keys and values to the HashMap
		list.put("Russel M Nelson", "Prophet");
		list.put("Carl B Cook", "Seventy");
		list.put("Jeffery R Holland", "Apostle");
		list.put("Dieter F Uthchtdorf", "Apostle");
		list.put("Patrick Kearon", "Seventy");
		list.put("Ulisses Soares", "Apostle");
		list.put("Gerals Causse", "Bishop");

		// Create ArrayList and sort it
		ArrayList<String> names = new ArrayList<String>(list.keySet());
		Collections.sort(names);
		
		for(String name : names) {
			System.out.printf("%s has the calling of %s.%n", name, list.get(name));
		}
		
	}

}

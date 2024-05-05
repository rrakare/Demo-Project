package CollectionPak;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Collection {

	public static void main(String[] args) {

		
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(6, "mumbai");
		hm.put(2, "Pune");
		hm.put(3, "Solapur");
		hm.put(4, "Nagpur");
		hm.put(5, "Bhandara");
		hm.put(1, "Wardha");
		hm.put(7, "Latur");
		hm.put(8, "Gondia");
		hm.put(9, "goa");

		 System.out.println(hm);

		for (Map.Entry<Integer, String> ob : hm.entrySet()) {

			System.out.print(ob + " ");

		}
		System.out.println();
		System.out.println(hm.get(5));
		System.out.println(hm.values());
		System.out.println(hm.keySet());

		for (Integer key : hm.keySet()) {

			System.out.print(key + " ");
		}
		System.out.println();
		for (String str : hm.values()) {

			System.out.print(str + " ");
		}
	}

}

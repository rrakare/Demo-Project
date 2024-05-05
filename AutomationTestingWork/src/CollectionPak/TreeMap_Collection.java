package CollectionPak;


import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Collection {

	public static void main(String[] args) {

		Map<Integer, String> hm = new TreeMap<Integer, String>();

		hm.put(1, "mumbai");
		hm.put(2, "Pune");
		hm.put(3, "Solapur");
		hm.put(4, "Nagpur");
		hm.put(5, "Bhandara");
		hm.put(6, "Wardha");
		hm.put(9, "Latur");
		hm.put(8, "Gondia");
		hm.put(8, "goa");

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

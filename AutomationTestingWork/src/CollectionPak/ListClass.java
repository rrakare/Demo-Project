package CollectionPak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListClass {

	public static void main(String[] args) {
		
		ArrayList arrObj = new ArrayList();
		arrObj.add(545);
		arrObj.add("548");
		arrObj.add("Raviraj");
		arrObj.add(10.51f);
		arrObj.add(102558888.51d);
		arrObj.add("Raviraj");
		arrObj.add(null);
		arrObj.add(9885588);
		arrObj.add("H");
		arrObj.add("Raviraj");
		
		
		for(Object ob : arrObj) {
			System.out.print(ob+" ");
		}
		System.out.println();
		for(int i=0; i<arrObj.size(); i++) {
			System.out.print(arrObj.get(i)+" ");
		}
		System.out.println();
		Iterator obIt =arrObj.iterator();
		
		while(obIt.hasNext())
			System.out.print(obIt.next()+" ");
		System.out.println();
		ListIterator obItList = arrObj.listIterator();
		
		while(obItList.hasNext())
			System.out.print(obItList.next()+" ");
	}

}

package CollectionPak;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListVector {

	public static void main(String[] args) {
		
		Vector obVector = new Vector();
		obVector.add("5845888");
		obVector.add(58545);
		obVector.add("Raviraj");
		obVector.add("Raviraj");
		obVector.add("Raj");
		obVector.add(5844.588855f);
		obVector.add(588855d);
		obVector.add(58545);
		obVector.add("Raviraj");
		obVector.add("Raviraj");
		obVector.add("H");
		
		System.out.println(obVector.capacity());
		System.out.println(obVector.add("Raavi"));
		System.out.println(obVector.remove(11));
		System.out.println(obVector.set(6, "Ravvi"));

		for(Object ob: obVector) {
			System.out.print(ob+" ");
		}
		System.out.println();
		
		Iterator obI = obVector.iterator();
		while(obI.hasNext())
			System.out.print(obI.next()+" ");
		System.out.println();
		
		ListIterator listIt =obVector.listIterator();
		while(listIt.hasNext())
			System.out.print(listIt.next()+" ");
	}
}

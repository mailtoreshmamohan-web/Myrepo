package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Sun");
		a.add("Moon");
		a.add("Earth");
		a.add("Mars");
		System.out.println(a);
		
		ArrayList<String> b=new ArrayList<String>();
		
		b.add("Car");
		b.add("Jeep");
		b.add("Bus");
		b.add("Cycle");
		System.out.println(b);
		
		//addAll() - to add a new list to the current list
		
		System.out.println(a.addAll(b));
		
		System.out.println(a);
		
		//containsAll() -to check one list in another list
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		
		Iterator<String> it=a.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(a);
		
	}

}

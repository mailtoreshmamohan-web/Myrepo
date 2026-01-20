package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class SetClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String>s=new HashSet<String>();
		
		s.add("Red");
		s.add("Blue");
		s.add("Green");
		s.add("White");
		s.add("Red");
		s.add(null);
		s.add(null);
System.out.println(s);


//We can do add,addAll,contains,containsAll,size,isEmpty

s.remove(null);
System.out.println(s);

//clear()- to clear the entire list

s.clear();
System.out.println(s);
	}

}

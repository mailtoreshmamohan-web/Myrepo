package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class CollectionClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>();
		System.out.println(a);
		
		//add() -to add elements in the collection
		a.add("Red");
		a.add("White");
		a.add("Red");
		a.add("Black");
		a.add("Blue");
		a.add("Green");
		System.out.println(a);
		
		//indexOf()- to return the index of particular element
		System.out.println(a.indexOf("Black"));
		System.out.println(a.indexOf("Red"));
		
		//If the elements are repeated, the indexOf shows the first occurrence
		
		//lastindexOf()-will show the last occurrence
		
System.out.println(a.lastIndexOf("Red"));

//remove() - to remove the elements inside the collection based on index

System.out.println(a.remove("Red"));    //object based removal
System.out.println(a);
a.remove(3);
System.out.println(a);

//contains() - to check whether an element is present or not in collection

System.out.println(a.contains("Green"));
System.out.println(a.contains("Orange"));

//isEmpty() - to check whether a collection is empty or not

if(a.isEmpty())
{
	System.out.println("List is empty");
}
else {
	System.out.println("List is not empty");
}

//get() - to retrieve a particular element from the list

System.out.println(a.get(3));

//size() - to find the length of the list

System.out.println(a.size());

//iterating list using for

for(int i=0;i<a.size();i++)
{
	System.out.println(a.get(i));
}
for(String col:a) {
	System.out.println(col);
}
	}
	

}

package stringprgm;

public class Bufferexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer a=new StringBuffer("Hello ");
System.out.println(a);
StringBuilder b=new StringBuilder("Beautiful");
System.out.println(b);
//insert()-to add new String to the current String based on index
a.insert(6, "World ");
System.out.println(a);
//append()-to add new String at the end of another String
System.out.println(a.append(b));
//replace()-to replace a String based on index position
System.out.println(a.replace(6, 11, "hai"));
//delete()-to delete a character/word in a string based on index
System.out.println(a.delete(6, 9));
//reverse()-to reverse the String
System.out.println(b.reverse());
System.out.println(a.reverse());
	}

}

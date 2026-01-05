package stringprgm;

public class StringExamole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello world " ;
String v="hello";
String h="HAI";
System.out.println(s);
String s1=new String("Reshma");
String w="";
System.out.println(s1);

//Length method-To find the length of the string

System.out.println(s.length());	
//charAt-to return the character of string

System.out.println(s.charAt(2));
//concat()-to add two strings
System.out.println(s.concat(s1));
//contains()-to check whether  a character or word is present in the string
System.out.println(s.contains(s1));
System.out.println(s.contains("b"));
//toUpperCase()- to convert samll letter string to convert to uppercase
System.out.println(v.toUpperCase());
//toLowerCase()-convert to capital letters
System.out.println(h.toLowerCase());
//isEmpty()-to check whether a string is empty or not
System.out.println(s.isEmpty());
System.out.println(w.isEmpty());
String d="hello";
String f="Hello";
//equals()-to check whether two strings are equal or not
System.out.println(v.equals(d));
System.out.println(d.equals(f));
System.out.println(v.equals(h));
//equalsIgnoreCase()-to ignore the case
System.out.println(d.equalsIgnoreCase(f));
System.out.println(d==v);
String j=new String("hello");
System.out.println(j.equals(v));
System.out.println(j==v); 
//Equal operater is used to compare the object reference(location),it does not compare the value.Equals method is used to compare the value 
String i=new String("hello");
System.out.println(j==i); 
System.out.println(j.equals(i));
//valueOf()-to convert any data type to String
int a=7;
System.out.println(String.valueOf(a));
//trim()-Used to remove leading(first) and trailing(last) white spaces from a String,it does not remove spacing b/w words
String b=" How are you? ";
System.out.println(b.trim());
//subString()-to extract a part of the String
System.out.println(b.substring(1, 4));
System.out.println(b.substring(5));

}

}

package inheritance;

public class Multilevel_child extends Multilevel_Intermediate 
	
{
	public void sum()
	{
int a=9;
int b=5;
int c=a+b;
System.out.println(c);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel_child obj=new Multilevel_child();
		obj.division();
		obj.sum();
		obj.sub();
		

}
}

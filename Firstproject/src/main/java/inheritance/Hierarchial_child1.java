package inheritance;

public class Hierarchial_child1 extends Hierarchial_Parent
{
	
	public void division()
	{
		int a=8;
		int b=4;
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchial_child1 obj=new Hierarchial_child1();
		obj.division();
		obj.sum();

	}

}

package inheritance;

public class Childclass extends Singleparent
{
	
	public void mul()
	{
		int a=3;
		int b=6;
		int c=a*b;
		System.out.println(c);
//	super.sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		obj.mul();
		obj.sum();

	}

}

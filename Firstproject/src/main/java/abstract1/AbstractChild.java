package abstract1;

public class AbstractChild extends Abstractclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj=new AbstractChild();
		System.out.println(obj.display());
		System.out.println(obj.display(3, 5));
		obj.show();
		obj.sub();
		//we cannot access child class property by creating parent class object or reference
//Reference creation
		Abstractclass obj1=new AbstractChild();
		System.out.println(obj1.display());
		System.out.println(obj1.display(5, 10));
		obj1.show();
		
		
		
	}
	
	public AbstractChild()
	{
		super(8,4);
		System.out.println("Hi");
	}

	@Override
	public int display() 
	{
		// TODO Auto-generated method stub
		
		int a=4;
		int b=5;
		int sum=a+b;
		return sum;
		
	}

	@Override
	public int display(int c, int d) {
		// TODO Auto-generated method stub
		int mul=c*d;
		return mul;
		
	}
public void sub()
{
int a=7;
int b=4;
int sub=a-b;
System.out.println(sub);
}
}

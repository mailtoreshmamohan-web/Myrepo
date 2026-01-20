package superkeyword1;

public class SuperMethod1 extends SuperParent{
	
	public void sum()
	{
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println(c);
		super.display();
		//super.show();
		this.display1();
	}
public void display1()
{
	System.out.println("Hello World");
	super.show();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMethod1 obj=new SuperMethod1();
		obj.sum();
		//obj.display();
	}

}

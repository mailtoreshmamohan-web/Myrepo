package polymorphism;

public class ChildPoly extends Parentpoly {
	
public void show()
{
	System.out.println("This is another instance method");	
	super.show();
}

public void display(int a,int b)
{
	int diff=a-b;
	System.out.println("Difference is "+diff);
	super.display(20, 10);
	
}



@Override
public void display1(int c, int d) {
	// TODO Auto-generated method stub
	super.display1(c, d);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	ChildPoly obj=new ChildPoly();

	obj.show();
	obj.display(100, 50);
	obj.display1(3, 4);
}
	



}

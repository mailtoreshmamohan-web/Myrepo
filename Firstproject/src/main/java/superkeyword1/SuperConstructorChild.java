package superkeyword1;

public class SuperConstructorChild extends SuperConstructorParent
{
	
	
public SuperConstructorChild()
{
	super();
System.out.println("Hello");	
}
public SuperConstructorChild(int a,float b)
{
	super(5,4);
	System.out.println(a/b);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj1=new SuperConstructorChild();
		//SuperConstructorParent obj2=new SuperConstructorParent();
		SuperConstructorChild obj3=new SuperConstructorChild(2,3.5f);
	}
}
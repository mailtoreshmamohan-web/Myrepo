package abstract1;

public abstract class Abstractclass {
	
	public abstract int display();
	
	public abstract int display(int c,int d);
	
	public void show()
	{
	System.out.println("Hello");
	}
	
	public Abstractclass()
	{
System.out.println("World");
	}
	public Abstractclass(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}
}

package interface1;

public interface ParentInterface {
	
	public abstract void display();
	
	public static final int a=7;
	int b=100;
	
	default void show()
	{
		System.out.println("Display");
	}
static void sum()
{
	System.out.println(a+b);
	

}
}

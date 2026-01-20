package inheritance;

public class Hierarchial_child2 extends Hierarchial_Parent 
{
	
	public void display()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchial_child2 obj=new Hierarchial_child2();
		obj.display();
        obj.sum();
        
	}

}

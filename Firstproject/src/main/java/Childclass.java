
public class Childclass extends Parent1 
{
	
	String color="White";
	

public void display()
{

System.out.println(super.color);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		obj.display();
	System.out.println(obj.color);

	}

}

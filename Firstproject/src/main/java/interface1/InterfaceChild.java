package interface1;

public class InterfaceChild implements ParentInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentInterface obj=new InterfaceChild();
		obj.display();
		System.out.println(a);
		obj.show();
		ParentInterface.sum();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		//b=56;   final value cannot be changed
		
	}

}

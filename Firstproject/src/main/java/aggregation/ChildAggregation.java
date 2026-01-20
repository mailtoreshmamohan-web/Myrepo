package aggregation;

public class ChildAggregation {
	String name;
	int age;
	ParentAggregation ref;
	
	public ChildAggregation(String name,int age,ParentAggregation ref)
{
	this.name=name;
	this.age=age;
	this.ref=ref;
	
}
	public void diplay()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println(ref.name+ref.age);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentAggregation obj1=new ParentAggregation("John",35);
		ChildAggregation obj=new ChildAggregation("Reshma",30,obj1);
		obj.diplay();
		
	
	}

}

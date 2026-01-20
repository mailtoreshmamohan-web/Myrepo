package aggregation;

public class AggreChild {
	String job;
	int rank;
	AggreParent ref;
	
	public AggreChild(String job,int rank,AggreParent ref)
	{
	
	this.job=job;
	this.rank=rank;
	this.ref=ref;
	}
	public void show()
	{
		System.out.println("Job is "+job);
		System.out.println("Rank is "+rank);
		System.out.println(ref.job + ref.rank);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggreParent obj1=new AggreParent("teacher",3);
		AggreChild obj=new AggreChild("Doctor",4,obj1);
		obj.show();
	}

}

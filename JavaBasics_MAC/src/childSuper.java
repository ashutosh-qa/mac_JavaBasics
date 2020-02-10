
public class childSuper extends parentSuper{
	
	String name="Super - Child Variable";
	
	
	//SUPER - for Constructor
	public childSuper() 
	{
		super(); //While calling SUPER for constructor, it should be at First line
		System.out.println("Child class constructor");
	}
	
	
	//SUPER - for Variable
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	
	//SUPER - for method
	public void getData()
	{
		super.getData();
		System.out.println("I am in Child class");
	}
	
	public static void main(String[] args) {
		
		childSuper cs = new childSuper();
		cs.getStringdata();
		cs.getData();
		
	}

}

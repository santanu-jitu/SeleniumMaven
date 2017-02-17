import org.testng.annotations.Test;

public class TestPriority {
	
	@Test(priority=1,groups="func")
	public void one(){
		
		System.out.println("Executing Test One");
	}
	
	@Test(priority=2,groups="bvt")
	public void two(){
		
		System.out.println("Executing Test Two");
	}
	
	
	@Test(priority=3,groups="sanity")
	public void three(){
		
		System.out.println("Executing Test Three");
	}
	
	
	@Test(priority=4,groups="func")
	public void four(){
		
		System.out.println("Executing Test Four");
	}

}

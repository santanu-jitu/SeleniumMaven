import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependency {
	
	@Test(groups="bvt")
	public void userReg(){
		
		System.out.println("Register a user");
		Assert.fail("User reg was not successful");
	}
	
	
	@Test(dependsOnMethods="userReg",groups="bvt")
	public void loginTest(){
		
		System.out.println("Login test");
		
	}

}

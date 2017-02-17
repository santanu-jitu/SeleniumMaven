import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void createDBConn(){
		
		System.out.println("Creating db conn");
	}
	
	@AfterTest
	public void closeDBConn(){
		
		System.out.println("Closing the db conn");
	}
	
	@BeforeMethod
	public void openBrowser(){
		
		System.out.println("Opening the browser");
	}
	
	@AfterMethod
	public void closeBrowser(){
		
		System.out.println("Closing the browser");
		
	}
	
	@Test(groups="bvt")
	public void doLogin(){
		
		
		System.out.println("Executing login test");
		
	}
	
	@Test(groups="bvt")
	public void userRegTest(){
		
		
		System.out.println("Executing user reg test");
		
	}

}

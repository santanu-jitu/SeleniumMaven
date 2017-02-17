import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTitleTest {

	
	@Test(groups="sanity")
	public void validateTitles(){
		
		
		//Website - title - actual - Gmail.com
		// database, excel - expected - Yahoo.com
		
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
		
		
	/*	
		if(expected_title.equals(actual_title)){
			
			
			System.out.println("Test case pass");
		}else{
			
			
			System.out.println("Test Case fail");
		}*/
		
		
		Assert.assertEquals(actual_title, expected_title);
		
		System.out.println("Test case ends");
		
	}
	
	@Test
	public void wikiTest(){
		
		System.out.println("executing second test");
		
	}
	
	
	
}

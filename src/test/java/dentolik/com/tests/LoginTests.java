package dentolik.com.tests;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import dentolik.com.commonservices.CommonServices;
import dentolik.com.pages.LoginPage;
import logger.Log;




public class LoginTests {
	public WebDriver driver;
	//Create object
	LoginPage loginpage;
	CommonServices commonServices ;
	
	@Before
	public void setUp() {
		loginpage  = PageFactory.initElements(driver, LoginPage.class);
		commonServices = PageFactory.initElements(driver, CommonServices.class);
	}
	
	@After
	public void tearDown()
	{
		Log.info("Shutting down driver");
	    driver.close();
	}
	

	@Test
	public void test() throws InterruptedException, IOException {
		commonServices.Valid_UserLogin();
	}

}

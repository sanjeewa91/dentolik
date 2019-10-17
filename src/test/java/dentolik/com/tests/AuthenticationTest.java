package dentolik.com.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import dentolik.com.pages.LoginPage;
import dentolik.com.pages.PageAuthentication;

public class AuthenticationTest {
	public WebDriver driver;
	//Create object
	LoginPage loginpage;
	PageAuthentication pageAuthentication;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		this.driver.get("https://jay.dentoclik.com/user");
		loginpage  = PageFactory.initElements(driver, LoginPage.class);
		pageAuthentication = PageFactory.initElements(driver, PageAuthentication.class);
		loginpage.EL_USERNAME.sendKeys(loginpage.USERNAME);
		loginpage.EL_PASSWORD.sendKeys(loginpage.PASSWORD);
		loginpage.clickSignIn();
	}
	

	@After
	public void tearDown() {
		driver.quit();
	}

	
	@Test
	public void test_valid_authentication() throws InterruptedException {
		pageAuthentication.clickContinue();	
		pageAuthentication.EL_AUTH_CODE.sendKeys(pageAuthentication.AuthCode);
		pageAuthentication.clickContinue();
	}

}

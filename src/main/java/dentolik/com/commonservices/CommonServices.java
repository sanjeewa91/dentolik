package dentolik.com.commonservices;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import dentolik.com.pages.LoginPage;
import dentolik.com.pages.PageAuthentication;
import dentolik.com.pages.PageDashboard;
import dentolik.com.pages.PagePatient;
import ie.exactest.config.Configurations;
import logger.Log;

public class CommonServices {
	public WebDriver driver;
	//Create object
	LoginPage loginpage;
	PageAuthentication pageAuthentication;
	PagePatient pagePatient;
	PageDashboard pageDashboard;
	Configurations conf = new Configurations();
	
	public void Valid_UserLogin() throws IOException {
		System.setProperty("webdriver.chrome.driver", conf.getPropValues("driver_path"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		this.driver.get(LoginPage.PAGE_URL);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		loginpage  = PageFactory.initElements(driver, LoginPage.class);		
		pageAuthentication = PageFactory.initElements(driver, PageAuthentication.class);
		pageDashboard  = PageFactory.initElements(driver, PageDashboard.class);
		pagePatient = PageFactory.initElements(driver, PagePatient.class);
		
		Log.info("Running Login Test");
		loginpage.EL_USERNAME.sendKeys(loginpage.USERNAME);
		loginpage.EL_PASSWORD.sendKeys(loginpage.PASSWORD);
		loginpage.clickSignIn();
		Log.info("Verified Login");
}
	
	
	public void Navigate_PatientScreen() throws InterruptedException, IOException {
		Valid_UserLogin();
		pageAuthentication.clickContinue();	
		Log.info("Running Authentication");
		pageAuthentication.EL_AUTH_CODE.sendKeys(pageAuthentication.AuthCode);
		pageAuthentication.clickContinue();
		pageDashboard.clickPatientIcon();
		pageDashboard.clickPatient();

}
}

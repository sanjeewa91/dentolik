package dentolik.com.tests;

import java.io.IOException;
import java.util.UUID;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import dentolik.com.commonservices.CommonServices;
import dentolik.com.pages.LoginPage;
import dentolik.com.pages.PageAuthentication;
import dentolik.com.pages.PageDashboard;
import dentolik.com.pages.PagePatient;
import logger.Log;

public class PatientTests {
	public WebDriver driver;
	//Create object
	LoginPage loginpage;
	PageAuthentication pageAuthentication;
	PagePatient pagePatient; 
	PageDashboard pageDashboard;
	CommonServices commonServices;

	String arr[] = UUID.randomUUID().toString().split("-");
	
	@Before
	public void setUp() throws InterruptedException {
		
		loginpage  = PageFactory.initElements(driver, LoginPage.class);
		commonServices = PageFactory.initElements(driver, CommonServices.class);
		pagePatient = PageFactory.initElements(driver, PagePatient.class);	
		pageDashboard = PageFactory.initElements(driver, PageDashboard.class);	
	}
	

	@After
	public void tearDown()
	{
		Log.info("Shutting down driver");
	    driver.quit();
	}
	
	@Test
	public void test_verify_Patient_Screen_navigation() throws InterruptedException {
		Assert.assertEquals(PagePatient.PAGE_TITLE, driver.getTitle());
	}

	@Test
	public void test_mandatoryfield_error_notification() throws InterruptedException, IOException {
		commonServices.Navigate_PatientScreen();
		pagePatient.clickNewPatient();
		pagePatient.clickSaveButton();
		Assert.assertEquals("Docter is required", PagePatient.MAND_NOTIFY_DOCTER.getText());
		Assert.assertEquals("First Name is required.", PagePatient.MAND_NOTIFY_F_NAME.getText());
		Assert.assertEquals("Last Name is required.", PagePatient.MAND_NOTIFY_L_NAME.getText());
		Assert.assertEquals("Gender is required", PagePatient.MAND_NOTIFY_GENDER.getText());
		Assert.assertEquals("Date of birth is required.", PagePatient.MAND_NOTIFY_B_DAY.getText());
	}
	

	@Test
	public void test_verify_error_messages_for_invalid_data() throws InterruptedException, IOException {
		commonServices.Navigate_PatientScreen();
		pagePatient.clickNewPatient();
		PagePatient.TXTF_NAME.sendKeys("FirstName"+arr[0]);
		PagePatient.TXTL_NAME.sendKeys("LastName"+arr[1]);
		pagePatient.clickMaleRadio();
		PagePatient.TXT_DOB.sendKeys(arr[2]);
		PagePatient.TXTL_MOBILE.sendKeys(arr[3]);
		Assert.assertEquals("Mobile must be numeric.", PagePatient.MOB_NO_NOTICICATION.getText());
		PagePatient.TXTL_FAX.sendKeys(arr[3]);
		PagePatient.TXTL_EMAIL.sendKeys(arr[4]);
		Assert.assertEquals("Enter valid email-id.", PagePatient.EMAIL_NOTICICATION.getText());
		pagePatient.clickSaveButton();
	}
	
}

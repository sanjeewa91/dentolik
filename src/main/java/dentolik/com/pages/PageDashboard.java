package dentolik.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageDashboard {
	public static final String PAGE_URL = "https://jay.dentoclik.com/user";
	public static final String PAGE_TITLE = "Sign In | Odontoclik";
	

	public static @FindBy(xpath = "/html/body/div[3]/div/main/nav/div/ul/li[3]/a/i") WebElement PATIENT_ICON;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/nav/div/ul/li[3]/a/span") WebElement PATIENT;
	

	WebDriver driver;
	
	
	public PageDashboard (WebDriver driver) {
		this.driver = driver;
		}	
	public void clickPatientIcon(){clickElements(PATIENT_ICON);		
	}
	public void clickPatient(){clickElements(PATIENT);		
	}
	
	
	public void clickElements(WebElement element){
		
		element.click();
		
	}
	
	public void navigatePatient(){
		clickPatientIcon();
		clickPatient();	
	}

}

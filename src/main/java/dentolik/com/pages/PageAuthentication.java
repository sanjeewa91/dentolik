package dentolik.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAuthentication {
	public static final String PAGE_URL = "https://jay.dentoclik.com/user/authentication";
	public static final String PAGE_TITLE = "Sign In | Odontoclik";
	public final String AuthCode = "123456";
	
	public @FindBy(id="OTPcode") WebElement EL_AUTH_CODE;
	
	@FindBy(name = "next") WebElement ELEM_CONTINUE;
				
	WebDriver driver;
	
	public PageAuthentication (WebDriver driver) {
		this.driver = driver;
		}	
	public void clickContinue(){clickElements1(ELEM_CONTINUE);		
	}
	
	public void clickElements1(WebElement element) {
		element.click();
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	public void clickElements(WebElement element){
		
		element.click();
		
	}
	

}

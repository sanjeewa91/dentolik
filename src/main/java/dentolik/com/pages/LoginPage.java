package dentolik.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
WebDriver driver;
	
	public static final String PAGE_URL = "https://jay.dentoclik.com/user";
	public static final String PAGE_TITLE = "Sign In | Odontoclik";
	public final String USERNAME = "isantetech2019@gmail.com";
	public final String PASSWORD = "F9cOqCOq";

	public @FindBy(id="username") WebElement EL_USERNAME;
	public @FindBy(id="password") WebElement EL_PASSWORD;
	
	@FindBy(id="signin") WebElement ELEM_SIGN_IN;

	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void clickSignIn() {clickElements(ELEM_SIGN_IN);
	}
	
	
	public void clickElements(WebElement element) {
		element.click();
	}
	

}

package dentolik.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagePatient {
	PageDashboard pageDashboard;
	
	public static final String PAGE_URL = "https://jay.dentoclik.com/user/index#/patientList";
	public static final String PAGE_TITLE = "Patient List | Odontoclik";

	//Elements of patient screen	
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[2]/div/div/div[1]/div[1]/div/ul/li/tooltip/tip-cont/a/i") WebElement ADD_PATIENT;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[2]/div/div/div[1]/input") WebElement TXTF_NAME;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[3]/div/div/div[1]/input") WebElement TXTL_NAME;
	public static @FindBy(id = "dob") WebElement TXT_DOB;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[6]/div/div/div/input") WebElement TXTL_MOBILE;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[7]/div/div/div[1]/input") WebElement TXTL_FAX;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[8]/div/div/div[1]/input") WebElement TXTL_EMAIL;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[9]/div/div/div[1]/textarea") WebElement TXTL_COMMENT;

	//Elemets of Add new patient pop up - error notification
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[1]/div/div/div[1]/span[1]") WebElement MAND_NOTIFY_DOCTER;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[2]/div/div/div[1]/span[1]") WebElement MAND_NOTIFY_F_NAME;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[3]/div/div/div[1]/span[1]") WebElement MAND_NOTIFY_L_NAME;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[4]/div/div/div[1]/label[2]/span") WebElement MAND_NOTIFY_GENDER;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[5]/div/div/div[1]/span") WebElement MAND_NOTIFY_B_DAY;
	

	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[6]/div/div/div/span[1]") WebElement MOB_NO_NOTICICATION;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[8]/div/div/div[1]/span[2]") WebElement EMAIL_NOTICICATION;
	

	
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[5]/div/div/div[2]/i") WebElement CALEND_ICON;

	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[5]/div/div/div[2]/i") WebElement MALE_RADIO;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[2]/div/div/div[5]/div/div/div[2]/i") WebElement FEMALE_RADIO;

	//Save and Cancel button
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[3]/button[1]") WebElement SAVE_BUTTON;
	public static @FindBy(xpath = "/html/body/div[3]/div/main/div/div[1]/div[3]/div/form/div/div[3]/button[2]") WebElement CANCEL_BUTTON;
	
	public void clickSaveButton(){clickElements(SAVE_BUTTON);		
	}
	
	public void clickCancelButton(){clickElements(CANCEL_BUTTON);		
	}

	


	WebDriver driver;	
	
	public PagePatient (WebDriver driver) {
		this.driver = driver;
		}
	
	public void clickNewPatient(){clickElements(ADD_PATIENT);		
	}

	public void clickCalIcon(){clickElements(CALEND_ICON);		
	}

	
	public void clickMaleRadio(){clickElements(MALE_RADIO);		
	}

	public void clickFemaleRadio(){clickElements(FEMALE_RADIO);		
	}

	
	public void clickElements(WebElement element){
		
		element.click();
		
	}

	public void navigatePatient(){
		pageDashboard.clickPatientIcon();
		pageDashboard.clickPatient();	
	}
	
}

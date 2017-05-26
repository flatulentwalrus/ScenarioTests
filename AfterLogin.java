
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterLogin {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[7]/td[4]/a")
	WebElement sickITLeaveBt;

	@FindBy(xpath = "//*[@id=\"leaveTypeRuleGeneral_chkCarryForward\"]")
	WebElement enableLeaveCarriedForwardCB;
	
	@FindBy(xpath = "//*[@id=\"leaveTypeRuleGeneral_chkWeekendsAsWorkingDay\"]")
	WebElement ConsiderWeekendsCB;

	@FindBy(xpath = "//*[@id=\"btnSave\"]")
	WebElement saveBt;

	@FindBy(xpath = "/html/body/div[1]/div[1]/a[2]")
	WebElement profileBt;
	
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[2]/a")
	WebElement logoutBt;
	
	public AfterLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

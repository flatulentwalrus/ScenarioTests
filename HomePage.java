
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(name = "txtUsername")
	WebElement usernameBox;

	@FindBy(name = "txtPassword")
	WebElement passwordBox;
	
	@FindBy(name = "Submit")
	WebElement loginBt;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrangeTests {
	static WebDriver driver;
	HomePage home;
	AfterLogin logged;
	@Before
	public void setup(){
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("https:///enterprise-demo.orangehrmlive.com//auth//login");
		
	}
	@Test
	public void testChangeLeave() throws InterruptedException {
		home = new HomePage(driver);
		logged = new AfterLogin(driver);
		final String userName = "sysadmin";
		final String password = "sysadmin";
		home.usernameBox = driver.findElement(By.name("txtUsername"));
		home.passwordBox = driver.findElement(By.name("txtPassword"));
		home.loginBt = driver.findElement(By.name("Submit"));	
		home.usernameBox.sendKeys(userName);
		home.passwordBox.sendKeys(password);
		home.loginBt.click();
		Thread.sleep(500);
		logged.sickITLeaveBt = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[7]/td[4]/a"));
		logged.sickITLeaveBt.click();
		Thread.sleep(500);
		logged.enableLeaveCarriedForwardCB = driver.findElement(By.xpath("//*[@id=\"leaveTypeRuleGeneral_chkCarryForward\"]"));
		logged.enableLeaveCarriedForwardCB.click();
		logged.ConsiderWeekendsCB = driver.findElement(By.xpath("//*[@id=\"leaveTypeRuleGeneral_chkWeekendsAsWorkingDay\"]"));
		logged.ConsiderWeekendsCB.click();
		logged.saveBt = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
		logged.saveBt.click();
		Thread.sleep(500);
		logged.profileBt = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]"));
		logged.profileBt.click();
		Thread.sleep(500);
		logged.logoutBt = driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a"));
		logged.logoutBt.click(); 
	}
	
	@After
	public void quitingTime() {
		try {
			driver.close();
			driver.quit();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationPractiseTest {
	static WebDriver driver;
	@Test
	public void testBuyDress() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		final String userName = "levelupit@outlook.com";
		final String password = "Pa55w0rd";
		Thread.sleep(5000);
		WebElement usernameBt = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement passwordBt = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		WebElement LogInBt = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		usernameBt.sendKeys(userName);
		passwordBt.sendKeys(password);
		Thread.sleep(500);
		LogInBt.click();
		Thread.sleep(500);
		WebElement womenBt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		womenBt.click();
		WebElement dressBt = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
		dressBt.click();
		Thread.sleep(500);
		WebElement addToCartBt = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		addToCartBt.click();
		Thread.sleep(500);
		WebElement crossBt = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
		crossBt.click();
		Thread.sleep(500);
		WebElement plusBt = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i"));
		plusBt.click();
		WebElement sizeBt = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[3]"));
		sizeBt.click();
		addToCartBt.click();
		Thread.sleep(500);
		WebElement checkOutBt = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		checkOutBt.click();
		Thread.sleep(500);
		checkOutBt = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		checkOutBt.click();
		checkOutBt = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		checkOutBt.click();
		Thread.sleep(500);
		WebElement tAndCsTkB = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
		tAndCsTkB.click();
		checkOutBt = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		checkOutBt.click();
		Thread.sleep(500);
		checkOutBt = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
		checkOutBt.click();
		Thread.sleep(500);
		checkOutBt = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		checkOutBt.click();
		Thread.sleep(500);
		driver.close();
		driver.quit();
	}
}

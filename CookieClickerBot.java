import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CookieClickerBot {
	static WebDriver driver;
	@Test
	public void testCookie() throws InterruptedException {
		final String lastSave = "Mi4wMDJ8fDE0OTU2OTg5OTg0NjU7MTQ5NTY5ODk5ODQ2NTsxNDk1Nzg3OTk2NjkzO0Nob2tsaXQgRG9scGhpbnzDpcKwwqAGfDE0NzMwNzUyNDE5LjcxMjI5NzsxMDk3Njc1NzA5NzY3LjkxNTk7MTc5OTc7NTY7MTM1Nzk3NTEzNzEuNDA0ODk7MjU3OzA7MDswOzA7MDswOzA7MDswOzU2OzA7MDswOzA7MDswOzswOzA7MDswOzA7MDswOy0xOy0xOy0xOy0xOy0xOzA7MDswOzA7NTA7MDswO3wxNDIsMTQyLDM3NjAyODYyNjc2MCwwOzExMywxMTMsMTQxOTA2OTYwNTAsMDs5Niw5NiwzNDIxNjY2Njg1LDA7NzgsNzgsMTE3OTQxMTEyODYsMDs2Niw2Niw0NDQzNjU0MjAwNCwwOzU0LDU0LDk4ODc0MDMyNDE2LDA7NDcsNDcsMjMyMzkxNDk5MzkxLDA7MTEsMTEsMjAzNjY4OTgyMTQ2LDA7OCw4LDU3MzgwNzAwMzk2LDA7MywzLDMzNjU5MjYxNTcyLDA7MCwwLDAsMDswLDAsMCwwOzAsMCwwLDA7MCwwLDAsMDt8w6fCv8K/w6fCv8K/w6fCv8K+w6TCoMKAw6TCg8K/w6fCv8K/w6fCj8K8w6TCg8Kzw6fCv8KAw6TCgMKAw6TCgMKPw6fCssKgw6TCgMKow6TCgMKAw6TCgMKAw6TCgMKMw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCv8Kww6fCvMKDw6fCgMKPw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6TCgMKAw6HCgMKAfMOnwr/CgMOkwr/CsMOkwr/Cs8Onwq3CqcOkwoDCh8OlwrzCgMOkwoDCmMOkwoDCgMOkwoDCgMOkwoDCgMOkwoDCgMOkwoDCgMOkwpjCocOkwoDCgMOkwoDCgMOkwoDCgMOkwoDCgMOkwoDCgMOkwoDCgA%3D%3D%21END%21";
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://orteil.dashnet.org/cookieclicker/");
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u006F')).perform();
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(500);
		WebElement importTb = driver.findElement(By.xpath("//*[@id=\"textareaPrompt\"]"));
		importTb.sendKeys(lastSave);
		WebElement loadBt = driver.findElement(By.xpath("//*[@id=\"promptOption0\"]"));
		loadBt.click();
		Thread.sleep(500);
		WebElement cookie = driver.findElement(By.xpath("//*[@id=\"bigCookie\"]"));
		while(true) cookie.click();
	}
}
//class = menu, value = Import save
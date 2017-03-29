package selenium_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class test {

	public static void main(String[] args) {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "/Users/imac/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		 driver.get("http://www.baidu.com");
		 WebElement webElement = driver.findElement(By.id("kw"));
		 
		 webElement.sendKeys("====");
	}

}

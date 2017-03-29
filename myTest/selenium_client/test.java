package selenium_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class test {
	public static WebDriver driver;
	public static WebElement webElement;

	/**
	 * 设置浏览器驱动地址
	 */
	public static void setChromedriver() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "/Users/imac/Downloads/chromedriver");
	}

	/**
	 * 打开浏览器
	 */
	public static void startChromeBro() {
		driver = new ChromeDriver();

	}

	/**
	 * 输入地址
	 */
	public static void getURL() {
		driver.get("http://www.baidu.com");
	}

	/**
	 * 查找ID = kw 的 元素
	 */
	public static void findElement() {
		webElement = driver.findElement(By.id("kw"));
	}

	/**
	 * 输入参数
	 */
	public static void sendKeys() {
		webElement.sendKeys("====");
	}

	/**
	 * 测试类入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

}

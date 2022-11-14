package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Options {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/imac/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.booking.com");
		

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("irbid"+Keys.ARROW_DOWN);
	
	}

}
 
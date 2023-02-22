package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase9 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//open browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
		
	WebElement username = driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
		
		
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,600)","");
	driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a")).click();
	
	driver.close();
	driver.quit();

	}

}

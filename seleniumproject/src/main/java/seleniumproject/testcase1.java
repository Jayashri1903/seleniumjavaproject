


package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//open browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
		
	WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		driver.findElement(By.name("login-button")).click();
driver.close();
driver.quit();
	}

}

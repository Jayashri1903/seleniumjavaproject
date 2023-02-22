package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase5 {

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
		
driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
driver.findElement(By.name("remove-sauce-labs-backpack")).click();
		
		
		
		
		

	}

}

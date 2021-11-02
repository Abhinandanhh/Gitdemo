package firstjavaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhinandan\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.cssSelector("input[value='Bengaluru (BLR)']")).click();
		
		/*WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
		
		Select dropdown = new Select(StaticDropdown);
	
		dropdown.deselectByValue("BLR");*/
	
		
		
		
	}

}

package firstjavaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhinandan\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.cssSelector("div[Class='mb-4'] select[class='bc-neutral-100 bg-transparent']")).click();
		
		WebElement adult = driver.findElement(By.cssSelector("div[Class='mb-4'] select[class='bc-neutral-100 bg-transparent']"));
		
		Select dropdown = new Select (adult);
		
		dropdown.selectByValue("2");
		
		driver.findElement(By.cssSelector("div[class='mb-4'] [class*='bg-transparent']")).click();
		
		WebElement Children = driver.findElement(By.cssSelector("div[class='mb-4'] [class*='bg-transparent']"));
		
		Select dropdown2 = new Select (Children);
		
		dropdown2.selectByValue("4");
		
		
		
		
		
		
	}

}

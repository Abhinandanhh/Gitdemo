package firstjavaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase11 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhinandan\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/uas/login?fromSignIn=true&trk=cold_join_sign_in");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abhinandanhh@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Anugraha44");
		
		driver.findElement(By.cssSelector("button[type*='submit']")).click();
		
		

	}

}

package firstjavaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhinandan\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:/google.com");
		
		driver.get("https://www.linkedin.com/uas/login?fromSignIn=true&trk=cold_join_sign_in");
		
		driver.findElement(By.id("username")).sendKeys("abhinandanhh");
		
		driver.findElement(By.name("session_password")).sendKeys("Anugraha");
		
		driver.findElement(By.xpath("//*[@id=\'organic-div\']/form/div[3]/button")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#error-for-username")).getText());

		
	}

}

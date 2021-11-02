package firstjavaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_11 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhinandan\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		
		
		
		

	}

}

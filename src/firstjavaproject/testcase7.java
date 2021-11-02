package firstjavaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhinandan\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.get("https://youtube.com");
		driver.getTitle();
		driver.navigate().back();
		driver.get("https://capgemini.com");
		driver.getTitle();
		
		callcase8 m=new callcase8();
		System.out.println(m.mandya());
		System.out.println(m.mysore());
		driver.close();
		
		

	}

}

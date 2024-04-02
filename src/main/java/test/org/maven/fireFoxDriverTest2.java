package test.org.maven;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class fireFoxDriverTest2 {
@Test

	public static void main(String[] args) {

		
		//WebDriverManager.firefoxdriver().setup();
		
		/*	String path = System.getProperty("user.dir"+"\\resources\\chromedriver.exe"); 
			System.setProperty("webdriver.chrome.driver",path);
		 */	

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohamed Nabil\\eclipse-workspace\\maven\\resources\\chromedriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
		driver.quit();

	}

}

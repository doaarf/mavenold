package test.org.maven;

//import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;




public class chromeDriverTest2 {

	public static void main(String[] args) {


		//	String path = System.getProperty("user.dir"); 
		//System.out.println(path+"\\resources\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().create();
		ChromeDriver driver = new ChromeDriver();






		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
		//driver.quit();  // close all instances

	}

}

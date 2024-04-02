package test.org.maven;


import org.openqa.selenium.edge.EdgeDriver;

public class edgeDriverTest3 {

	public static void main(String[] args) {

		/*	String path = System.getProperty("user.dir"+"\\resources\\chromedriver.exe"); 
			System.setProperty("webdriver.chrome.driver",path);
		 */	

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohamed Nabil\\eclipse-workspace\\maven\\resources\\chromedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
		driver.quit();

	}

}

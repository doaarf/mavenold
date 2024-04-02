package test.org.maven;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.assertThat;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;


public class HelloWorldChromeNGTest {

   //static final Logger log= getLogger(lookup().lookupClass());

    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void teardown() {
       driver.quit();
    }

    @Test
    public void test() {
        // Exercise
        String sutUrl = "https://bonigarcia.dev/selenium-webdriver-java/";
        driver.get(sutUrl);
        String title = driver.getTitle();
    //   log.debug("The title of {} is {}", sutUrl, title);
     

        // Verify
        assert(title).contains("Hands-On Selenium WebDriver with Java");
        //assertThat(title).isEqualTo("Hands-On Selenium WebDriver with Java");
    }

}

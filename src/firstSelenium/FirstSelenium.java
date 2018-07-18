package firstSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver", "C:\\test_automation\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
        String expectedTitle = "Welcome: Mercury Tours";
        driver.get("http://newtours.demoaut.com");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        //driver.close();
    }
}


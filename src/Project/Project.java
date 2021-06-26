package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project {
	@Test
	public void title() throws Exception{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avneet\\Downloads\\chromedriver_win32\\chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     
     driver.get("http://book.theautomatedtester.co.uk/");
     
     String actualTitle = "Selenium: Beginners Guide";
     String expectedTitle = driver.getTitle();
     
     Assert.assertEquals(expectedTitle, actualTitle);
     System.out.println("Test Case Passed");
    
	}

}

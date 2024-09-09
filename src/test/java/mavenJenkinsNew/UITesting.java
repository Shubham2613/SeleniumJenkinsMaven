package mavenJenkinsNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITesting {
	@Parameters("Browser")
	@Test
	public void startBrowser(String browserName) {
		System.out.println("Parameter value is :"+browserName);
		
		WebDriver driver = null;
		if(browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://saucelabs.com/");
		
		String exptitle = "Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing";
		String actTitle = driver.getTitle();
		
		Assert.assertEquals(exptitle, actTitle);
		
		driver.quit();
	
	}
}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChooseABrowser {
	
	public static void BrowserChoice(WebDriver driver,String BrowerName) {
		
		if(BrowerName.equals("Chrome")) {
			driver =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://svcollegetest.000webhostapp.com/");
			driver.findElement(By.id("startB")).click();
		}
		
		else if(BrowerName.equals("Firefox")) {
			driver =  new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://svcollegetest.000webhostapp.com/");
			driver.findElement(By.id("startB")).click();
		}
		else {
			System.out.println("The browser does not support");
		}
		
	}

}

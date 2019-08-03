import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TriviaQuestion {
	
	public static void TriviaQuestion (WebDriver driver, String firstQuestion) {

        
        driver.findElement(By.name("question")).sendKeys(firstQuestion);
    
    }

}

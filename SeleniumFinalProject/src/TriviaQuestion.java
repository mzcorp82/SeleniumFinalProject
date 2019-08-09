import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TriviaQuestion {
	
	public static void TriviaQuestion (WebDriver Cdriver, String firstQuestion) {

        
		Cdriver.findElement(By.name("question")).sendKeys(firstQuestion);
    
    }

}

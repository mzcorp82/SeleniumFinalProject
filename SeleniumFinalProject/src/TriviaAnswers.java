import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TriviaAnswers {
	
	public static void TriviaAnswers (WebDriver Cdriver, String firstAnsw, String secondAnsw, String thirdAnsw, String forthAnsw) {

        
        
        Cdriver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys(firstAnsw);
        
        Cdriver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys(secondAnsw);
        
        Cdriver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys(thirdAnsw);
        
        Cdriver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys(forthAnsw);

    }

}

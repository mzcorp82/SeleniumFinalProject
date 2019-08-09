import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QnAone {
	
	public static void QnAone (WebDriver Cdriver, String firstQuestion, String firstAnsw, String secondAnsw, String thirdAnsw, String forthAnsw) {

        
		Cdriver.findElement(By.name("question")).sendKeys(firstQuestion);
		Cdriver.findElement(By.id("nextquest")).click();
		Cdriver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys(firstAnsw);
		Cdriver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys(secondAnsw);
		Cdriver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys(thirdAnsw);
		Cdriver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys(forthAnsw);

    }

}

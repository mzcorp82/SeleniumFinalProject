import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QnAthree {
	
	public static void QnAthree (WebDriver driver, String thirdQuestion, String firstAnsw, String secondAnsw, String thirdAnsw, String forthAnsw) {

        driver.findElement(By.name("question")).sendKeys(thirdQuestion);
        driver.findElement(By.id("nextquest")).click();
        driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys(firstAnsw);
        driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys(secondAnsw);
        driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys(thirdAnsw);
        driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys(forthAnsw);


    }

}

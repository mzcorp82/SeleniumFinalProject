import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QnAone {
	
	public static void QnAone (WebDriver driver, String firstQuestion, String firstAnsw, String secondAnsw, String thirdAnsw, String forthAnsw) {

        driver.manage().window().maximize();
        driver.get("https://svcollegetest.000webhostapp.com/");
        driver.findElement(By.id("startB")).click();
        driver.findElement(By.name("question")).sendKeys(firstQuestion);
        driver.findElement(By.id("nextquest")).click();
        driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys(firstAnsw);
        driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys(secondAnsw);
        driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys(thirdAnsw);
        driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys(forthAnsw);
        driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
        driver.findElement(By.id("nextquest")).click();
    }

}

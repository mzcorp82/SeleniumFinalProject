import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GameThirdRound {
	
	public static void GameThirdRound(WebDriver driver) {
		
		driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
		driver.findElement(By.id("btnnext")).click();
		
		
	}

}

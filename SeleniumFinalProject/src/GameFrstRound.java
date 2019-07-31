import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GameFrstRound {
	
	public static void GameFrstRound(WebDriver driver) {
		
		
		driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
		driver.findElement(By.id("btnnext")).click();
		
	}

}

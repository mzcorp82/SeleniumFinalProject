import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GameSecondRound {
	
	public static void GameSecondRound (WebDriver Cdriver) {
		
		Cdriver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
		Cdriver.findElement(By.id("btnnext")).click();
	}
	
}

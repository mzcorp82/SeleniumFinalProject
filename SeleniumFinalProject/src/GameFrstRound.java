import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GameFrstRound {
	
	public static void GameFrstRound(WebDriver Cdriver) {
		
		
		Cdriver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
		Cdriver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
		Cdriver.findElement(By.id("btnnext")).click();
		
	}

}

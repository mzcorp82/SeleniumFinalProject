import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnswerRadioButton {
	
	public static void RadioButton(WebDriver driver,int RadioButtonAnswer) {
		
		if(RadioButtonAnswer == 1) {
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
			driver.findElement(By.id("nextquest")).click();
		}
		else if(RadioButtonAnswer == 2) {
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input")).click();
			driver.findElement(By.id("nextquest")).click();
		}
		else if(RadioButtonAnswer == 3) {
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input")).click();
			driver.findElement(By.id("nextquest")).click();
		}
		else if(RadioButtonAnswer == 4) {
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[1]/input")).click();
			driver.findElement(By.id("nextquest")).click();
		}
		
		
	}

}

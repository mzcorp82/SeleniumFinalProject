import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InGameRadioButton {
	
	public static void RadioButton(WebDriver driver,  int RadioButtonQuestion, int RadioButtonAnswer ) {
		
		if(RadioButtonQuestion==1) {
			if(RadioButtonAnswer == 1) {
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
			else if(RadioButtonAnswer == 2) {
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[2]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
			else if(RadioButtonAnswer == 3) {
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
			else if(RadioButtonAnswer == 4) {
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[4]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
		}
		
		if(RadioButtonQuestion==2) {
			if(RadioButtonAnswer == 1) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[1]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
			else if(RadioButtonAnswer == 2) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
			else if(RadioButtonAnswer == 3) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[3]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
			else if(RadioButtonAnswer == 4) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[4]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
		}
		
		if(RadioButtonQuestion==3) {
			if(RadioButtonAnswer == 1) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
			else if(RadioButtonAnswer == 2) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[2]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
			else if(RadioButtonAnswer == 3) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[3]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
			else if(RadioButtonAnswer == 4) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[4]")).click();
				driver.findElement(By.id("btnnext")).click();
			}
		}
	}

}

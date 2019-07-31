

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class GamesSanity {
	
	WebDriver driver = new ChromeDriver();


	@Test
	void test() throws InterruptedException {
		
		QnAone.QnAone(driver, "a", "a","b","c","d");
        QnAtwo.QnAtwo(driver,"b","g","b","r","u");
        QnAthree.QnAthree(driver,"c","w","j","c","q");
        GameFrstRound.GameFrstRound(driver);
        GameSecondRound.GameSecondRound(driver);
        GameThirdRound.GameThirdRound(driver);
//        Thread.sleep(3000);
        driver.quit();
		
	}
	
	//Boundary Values Test
    @Test
    void QnABVMultiply5() throws InterruptedException{

        QnAone.QnAone(driver, "aaaaa", "aaaaa","bbbbb","ccccc","ddddd");
        QnAtwo.QnAtwo(driver,"bbbbb","ggggg","bbbbb","rrrrr","uuuuu");
        QnAthree.QnAthree(driver,"ccccc","wwwww","jjjjj","ccccc","qqqqq");
        GameFrstRound.GameFrstRound(driver);
        GameSecondRound.GameSecondRound(driver);
        GameThirdRound.GameThirdRound(driver);
//        Thread.sleep(2000);
        driver.quit();
    }
    
    @Test
    void QnABVMultiply10() throws InterruptedException{

        QnAone.QnAone(driver, "aaaaaaaaaa", "aaaaaaaaaa","bbbbbbbbbb","cccccccccc","dddddddddd");
        QnAtwo.QnAtwo(driver,"bbbbbbbbbb","gggggggggg","bbbbbbbbbb","rrrrrrrrrr","uuuuuuuuuu");
        QnAthree.QnAthree(driver,"cccccccccc","wwwwwwwwww","jjjjjjjjjj","cccccccccc","qqqqqqqqqq");
        GameFrstRound.GameFrstRound(driver);
        GameSecondRound.GameSecondRound(driver);
        GameThirdRound.GameThirdRound(driver);
//        Thread.sleep(2000);
        driver.quit();
    }
	
	@Test
	void QnABVMultiply20() throws InterruptedException{

		QnAone.QnAone(driver, "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa","bbbbbbbbbbbbbbbbbbbb","cccccccccccccccccccc","dddddddddddddddddddd");
		QnAtwo.QnAtwo(driver,"bbbbbbbbbbbbbbbbbbbb","gggggggggggggggggggg","bbbbbbbbbbbbbbbbbbbb","rrrrrrrrrrrrrrrrrrrr","uuuuuuuuuuuuuuuuuuuu");
		QnAthree.QnAthree(driver,"cccccccccccccccccccc","wwwwwwwwwwwwwwwwwwww","jjjjjjjjjjjjjjjjjjjj","cccccccccccccccccccc","qqqqqqqqqqqqqqqqqqqq");
		GameFrstRound.GameFrstRound(driver);
		GameSecondRound.GameSecondRound(driver);
		GameThirdRound.GameThirdRound(driver);
//		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
    void QnABVMultiply40()  throws InterruptedException{

        QnAone.QnAone(driver, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","cccccccccccccccccccccccccccccccccccccccc","dddddddddddddddddddddddddddddddddddddddd");
        QnAtwo.QnAtwo(driver,"bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","gggggggggggggggggggggggggggggggggggggggg","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr","uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        QnAthree.QnAthree(driver,"cccccccccccccccccccccccccccccccccccccccc","wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww","jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj","cccccccccccccccccccccccccccccccccccccccc","qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        GameFrstRound.GameFrstRound(driver);
        GameSecondRound.GameSecondRound(driver);
        GameThirdRound.GameThirdRound(driver);
        Thread.sleep(2000);
        driver.quit();
    }
	
	 //Functionality Test
//  @Test
//  void PopUpMessage() {
//
//  }

      @Test
      void IsFirstWebPageTurn() throws InterruptedException {
          QnAone.QnAone(driver, "a", "a","b","c","d");
          if(driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
              Thread.sleep(1000);
              driver.findElement(By.name("question")).sendKeys("b");
              driver.findElement(By.id("backquest")).click();
          }
          Thread.sleep(2000);
          driver.quit();

      }
      
      @Test
      void IsSecondWebPageTurn() throws InterruptedException {
          QnAone.QnAone(driver, "a", "a","b","c","d");
          QnAtwo.QnAtwo(driver,"b","g","b","r","u");
          if(driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
              Thread.sleep(1000);
              driver.findElement(By.name("question")).sendKeys("b");
              driver.findElement(By.id("backquest")).click();
          }
          Thread.sleep(2000);
          driver.quit();
      }
      
      @Test
      void IsThirdWebPageTurn() throws InterruptedException {
          QnAone.QnAone(driver, "a", "a","b","c","d");
          QnAtwo.QnAtwo(driver,"b","g","b","r","u");
          QnAthree.QnAthree(driver,"c","w","j","c","q");
          if(driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
              driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[2]")).click();
          }


      }
      
//      @Test
//      void IsQuestionSaved() {
//
//      }
//
//      @Test
//      void TestWithNumbers() {
//
//      }
//
//      @Test
//      void FaildQuastionTest() {
//
//      }
//
//      @Test
//      void StartNewGame() {
//
//      }
//
//      @Test
//      void CloseGame() {
//
//      }
//
//      @Test
//      void RadioButtonTest() {
//
//      }
//
//      @Test
//      void IfThePageIsCorrect() {
//
//      }
//
//      //Erroe Handling
//      @Test
//      void IncorrectInput() {
//
//      }
//
//      //Integration
//      @Test
//      void FacebookIntegration() {
//
//      }
//
//      //Compatibility
//      @Test
//      void FirefoxCompatibility() {
//
//      }
		
	

}

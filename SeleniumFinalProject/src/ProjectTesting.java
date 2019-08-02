

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ProjectTesting {
	
	WebDriver driver = new ChromeDriver();


//	@Test
//	void test() throws InterruptedException {
//		
//		QnAone.QnAone(driver, "a", "a","b","c","d");
//		AnswerRadioButton.RadioButton(driver, 1);
//        QnAtwo.QnAtwo(driver,"b","g","b","r","u");
//		AnswerRadioButton.RadioButton(driver, 2);
//        QnAthree.QnAthree(driver,"c","w","j","c","q");
//		AnswerRadioButton.RadioButton(driver, 3);
//        GameFrstRound.GameFrstRound(driver);
//        GameSecondRound.GameSecondRound(driver);
//        GameThirdRound.GameThirdRound(driver);
////        Thread.sleep(3000);
//        driver.quit();
//		
//	}
//
//	
//	//Boundary Values Test
//    @Test
//    void QnABVMultiply5() throws InterruptedException{
//
//        QnAone.QnAone(driver, "aaaaa", "aaaaa","bbbbb","ccccc","ddddd");
//        AnswerRadioButton.RadioButton(driver, 1);
//        QnAtwo.QnAtwo(driver,"bbbbb","ggggg","bbbbb","rrrrr","uuuuu");
//        AnswerRadioButton.RadioButton(driver, 2);
//        QnAthree.QnAthree(driver,"ccccc","wwwww","jjjjj","ccccc","qqqqq");
//        AnswerRadioButton.RadioButton(driver, 3);
//        GameFrstRound.GameFrstRound(driver);
//        GameSecondRound.GameSecondRound(driver);
//        GameThirdRound.GameThirdRound(driver);
////        Thread.sleep(2000);
//        driver.quit();
//    }
//    
//    @Test
//    void QnABVMultiply10() throws InterruptedException{
//
//        QnAone.QnAone(driver, "aaaaaaaaaa", "aaaaaaaaaa","bbbbbbbbbb","cccccccccc","dddddddddd");
//        AnswerRadioButton.RadioButton(driver, 1);
//        QnAtwo.QnAtwo(driver,"bbbbbbbbbb","gggggggggg","bbbbbbbbbb","rrrrrrrrrr","uuuuuuuuuu");
//        AnswerRadioButton.RadioButton(driver, 2);
//        QnAthree.QnAthree(driver,"cccccccccc","wwwwwwwwww","jjjjjjjjjj","cccccccccc","qqqqqqqqqq");
//        AnswerRadioButton.RadioButton(driver, 3);
//        GameFrstRound.GameFrstRound(driver);
//        GameSecondRound.GameSecondRound(driver);
//        GameThirdRound.GameThirdRound(driver);
////        Thread.sleep(2000);
//        driver.quit();
//    }
//	
//	@Test
//	void QnABVMultiply20() throws InterruptedException{
//
//		QnAone.QnAone(driver, "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa","bbbbbbbbbbbbbbbbbbbb","cccccccccccccccccccc","dddddddddddddddddddd");
//		AnswerRadioButton.RadioButton(driver, 1);
//		QnAtwo.QnAtwo(driver,"bbbbbbbbbbbbbbbbbbbb","gggggggggggggggggggg","bbbbbbbbbbbbbbbbbbbb","rrrrrrrrrrrrrrrrrrrr","uuuuuuuuuuuuuuuuuuuu");
//		AnswerRadioButton.RadioButton(driver, 2);
//		QnAthree.QnAthree(driver,"cccccccccccccccccccc","wwwwwwwwwwwwwwwwwwww","jjjjjjjjjjjjjjjjjjjj","cccccccccccccccccccc","qqqqqqqqqqqqqqqqqqqq");
//		AnswerRadioButton.RadioButton(driver, 3);
//		GameFrstRound.GameFrstRound(driver);
//		GameSecondRound.GameSecondRound(driver);
//		GameThirdRound.GameThirdRound(driver);
////		Thread.sleep(2000);
//		driver.quit();
//	}
//	
//	@Test
//    void QnABVMultiply40()  throws InterruptedException{
//
//        QnAone.QnAone(driver, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","cccccccccccccccccccccccccccccccccccccccc","dddddddddddddddddddddddddddddddddddddddd");
//        AnswerRadioButton.RadioButton(driver, 1);
//        QnAtwo.QnAtwo(driver,"bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","gggggggggggggggggggggggggggggggggggggggg","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr","uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
//        AnswerRadioButton.RadioButton(driver, 2);
//        QnAthree.QnAthree(driver,"cccccccccccccccccccccccccccccccccccccccc","wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww","jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj","cccccccccccccccccccccccccccccccccccccccc","qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
//        AnswerRadioButton.RadioButton(driver, 3);
//        GameFrstRound.GameFrstRound(driver);
//        GameSecondRound.GameSecondRound(driver);
//        GameThirdRound.GameThirdRound(driver);
//        Thread.sleep(2000);
//        driver.quit();
//    }
//	
//	 //Functionality Test
//	@Test
//	void PopUpFirstMessage() {
//		
//		QnAone.QnAone(driver, "a", "a","b","c","d");
//		driver.findElement(By.id("nextquest")).click();
////        Thread.sleep(3000);
//        driver.quit();		
//  	}
//	
//	@Test
//	void PopUpSecondMessage() {
//		
//		QnAone.QnAone(driver, "a", "a","b","c","d");
//		AnswerRadioButton.RadioButton(driver, 1);
//        QnAtwo.QnAtwo(driver,"b","g","b","r","u");
//        driver.findElement(By.id("nextquest")).click();
////        Thread.sleep(3000);
//        driver.quit();		
//  	}
//	
//	@Test
//	void PopUpThirdMessage() {
//		
//		QnAone.QnAone(driver, "a", "a","b","c","d");
//		AnswerRadioButton.RadioButton(driver, 1);
//        QnAtwo.QnAtwo(driver,"b","g","b","r","u");
//		AnswerRadioButton.RadioButton(driver, 2);
//        QnAthree.QnAthree(driver,"c","w","j","c","q");
//        driver.findElement(By.id("nextquest")).click();
////        Thread.sleep(3000);
//        driver.quit();		
//  	}
//
//      @Test
//      void IsFirstWebPageTurn() throws InterruptedException {
//          QnAone.QnAone(driver, "a", "a","b","c","d");
//          AnswerRadioButton.RadioButton(driver, 1);
//          if(driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
//              Thread.sleep(1000);
//              driver.findElement(By.name("question")).sendKeys("b");
//              driver.findElement(By.id("backquest")).click();
//          }
//          Thread.sleep(2000);
//          driver.quit();
//
//      }
//      
//      @Test
//      void IsSecondWebPageTurn() throws InterruptedException {
//          QnAone.QnAone(driver, "a", "a","b","c","d");
//          AnswerRadioButton.RadioButton(driver, 1);
//          QnAtwo.QnAtwo(driver,"b","g","b","r","u");
//          AnswerRadioButton.RadioButton(driver, 2);
//          if(driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
//              Thread.sleep(1000);
//              driver.findElement(By.name("question")).sendKeys("b");
//              driver.findElement(By.id("backquest")).click();
//          }
//          Thread.sleep(2000);
//          driver.quit();
//      }
//      
//      @Test
//      void IsThirdWebPageTurn() throws InterruptedException {
//          QnAone.QnAone(driver, "a", "a","b","c","d");
//          AnswerRadioButton.RadioButton(driver, 1);
//          QnAtwo.QnAtwo(driver,"b","g","b","r","u");
//          AnswerRadioButton.RadioButton(driver, 2);
//          QnAthree.QnAthree(driver,"c","w","j","c","q");
//          AnswerRadioButton.RadioButton(driver, 3);
//          if(driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
//              driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[2]")).click();
//          }
//
//
//      }
      
      @Test
      void IsFirstQnASaved() {
    	QnAone.QnAone(driver, "a", "a","b","c","d");
  		AnswerRadioButton.RadioButton(driver, 1);
  		driver.findElement(By.id("backquest")).click();
  		
  		String firstAnswer = driver.findElement(By.name("answer1")).getAttribute("value");
 		
  		if (firstAnswer.equalsIgnoreCase(" ")) {
  			System.out.println("Test failed");
  		}
  		else {
  			System.out.println("The test has passed");
  		}
 		driver.quit();
  		}
      
      @Test
      void IsSecondQnASaved() {
      QnAone.QnAone(driver, "a", "a","b","c","d");
      AnswerRadioButton.RadioButton(driver, 1);
      QnAtwo.QnAtwo(driver,"b","g","b","r","u");
      AnswerRadioButton.RadioButton(driver, 1);
      
      String firstAnswer = driver.findElement(By.name("answer1")).getAttribute("value");
		
      if (firstAnswer.equalsIgnoreCase(" ")) {
			System.out.println("Test failed");
		}
      else {
			System.out.println("The test has passed");
		}
		driver.quit();
		}
      
      @Test
      void IsThirdQnASaved() {
      QnAone.QnAone(driver, "a", "a","b","c","d");
      AnswerRadioButton.RadioButton(driver, 1);
      QnAtwo.QnAtwo(driver,"b","g","b","r","u");
      AnswerRadioButton.RadioButton(driver, 1);
      QnAthree.QnAthree(driver,"c","w","j","c","q");
      AnswerRadioButton.RadioButton(driver, 1);
      
      String firstAnswer = driver.findElement(By.name("answer1")).getAttribute("value");
 		
  		if (firstAnswer.equalsIgnoreCase(" ")) {
  			System.out.println("Test failed");
  		}
  		else {
  			System.out.println("The test has passed");
  		}
 		driver.quit();
  		}
		
      
  		

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

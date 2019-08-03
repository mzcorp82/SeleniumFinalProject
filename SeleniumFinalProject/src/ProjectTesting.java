

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ProjectTesting {

	WebDriver driver = new ChromeDriver();

	@BeforeEach
	void beforAllClass() {
		driver.manage().window().maximize();
		driver.get("https://svcollegetest.000webhostapp.com/");
		driver.findElement(By.id("startB")).click();
	}

	@AfterEach
	void closeBrowser() {
		driver.quit();
	}

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

	//    }
	//	
	//	 //Functionality Test
	//	@Test
	//	void PopUpFirstMessage() {
	//		
	//		QnAone.QnAone(driver, "a", "a","b","c","d");
	//		driver.findElement(By.id("nextquest")).click();
	////        Thread.sleep(3000);

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

	//	@Test
	//	void IsFirstQnASaved() {
	//		QnAone.QnAone(driver, "a", "a","b","c","d");
	//		AnswerRadioButton.RadioButton(driver, 1);
	//		driver.findElement(By.id("backquest")).click();
	//		if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!")==true) {
	//			String firstQnA = driver.findElement(By.name("answer1")).getAttribute("value");
	//			if (firstQnA.equalsIgnoreCase(" ")) {
	//				System.out.println("Answer test failed");
	//			}
	//			else {
	//				driver.findElement(By.id("backquest")).click();
	//				if(driver.getPageSource().contains("Please type here your question")==true) {
	//					String firstQuestion = driver.findElement(By.name("question")).getAttribute("value");
	//					if (firstQuestion.equalsIgnoreCase(" ")) {
	//						System.out.println("question test failed");				}
	//					else {
	//						System.out.println("The test has passed");
	//					}
	//				}
	//			}
	//		}	

	//	}

	//			@Test
	//			void IsSecondQnASaved() {
	//				QnAone.QnAone(driver, "a", "a","b","c","d");
	//				AnswerRadioButton.RadioButton(driver, 1);
	//				QnAtwo.QnAtwo(driver, "b","g","b","r","u");
	//				AnswerRadioButton.RadioButton(driver, 2);
	//				driver.findElement(By.name("question")).sendKeys("a");
	//				driver.findElement(By.id("backquest")).click();
	//				
	//				if(!driver.getPageSource().contains("question number: 3")==true) {
	//					String secondQnA = driver.findElement(By.name("answer1")).getAttribute("value");
	//					if (secondQnA.equalsIgnoreCase(" ")) {
	//						System.out.println("Answer test failed");
	//					}
	//					else {
	//						driver.findElement(By.id("backquest")).click();
	//						if(!driver.getPageSource().contains("question number: 3")==true) {
	//							String secondQuestion = driver.findElement(By.name("question")).getAttribute("value");
	//							if (secondQuestion.equalsIgnoreCase(" ")) {
	//								System.out.println("question test failed");				}
	//							else {
	//								System.out.println("The test has passed");
	//							}
	//						}
	//					}
	//				}
	//			System.out.println("The test has failed");
	//
	//			}



	//	@Test
	//	void TestWithNumbers() {
	//
	//		QnAone.QnAone(driver, "a", "1","3","7","9");
	//		AnswerRadioButton.RadioButton(driver, 1);
	//		QnAtwo.QnAtwo(driver,"b","5","7","3","9");
	//		AnswerRadioButton.RadioButton(driver, 2);
	//		QnAthree.QnAthree(driver,"c","85","78","99","45");
	//		AnswerRadioButton.RadioButton(driver, 3);
	//		GameFrstRound.GameFrstRound(driver);
	//		GameSecondRound.GameSecondRound(driver);
	//		GameThirdRound.GameThirdRound(driver);
	//		//        Thread.sleep(3000);

	//	}
	//
	//	@Test
	//	void FaildQuastionTest() {
	//
	//		QnAone.QnAone(driver, "a", "a","b","c","d");
	//		AnswerRadioButton.RadioButton(driver, 1);
	//		QnAtwo.QnAtwo(driver,"b","g","b","r","u");
	//		AnswerRadioButton.RadioButton(driver, 2);
	//		QnAthree.QnAthree(driver,"c","w","j","c","q");
	//		AnswerRadioButton.RadioButton(driver, 3);
	//		driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
	//		
	//		InGameRadioButton.RadioButton(driver, 1, 4);
	//		InGameRadioButton.RadioButton(driver, 2, 4);
	//		InGameRadioButton.RadioButton(driver, 3, 4);
	//		//        Thread.sleep(3000);

	//
	//	}

	//	@Test
	//	void StartNewGame() {
	//
	//		QnAone.QnAone(driver, "a", "1","3","7","9");
	//		AnswerRadioButton.RadioButton(driver, 1);
	//		QnAtwo.QnAtwo(driver,"b","5","7","3","9");
	//		AnswerRadioButton.RadioButton(driver, 2);
	//		QnAthree.QnAthree(driver,"c","85","78","99","45");
	//		AnswerRadioButton.RadioButton(driver, 3);
	//		GameFrstRound.GameFrstRound(driver);
	//		GameSecondRound.GameSecondRound(driver);
	//		GameThirdRound.GameThirdRound(driver);
	//		driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[1]")).click();
	//		//        Thread.sleep(3000);

	//
	//	}
	//
	//	@Test
	//	void CloseGame() {
	//
	//		QnAone.QnAone(driver, "a", "1","3","7","9");
	//		AnswerRadioButton.RadioButton(driver, 1);
	//		QnAtwo.QnAtwo(driver,"b","5","7","3","9");
	//		AnswerRadioButton.RadioButton(driver, 2);
	//		QnAthree.QnAthree(driver,"c","85","78","99","45");
	//		AnswerRadioButton.RadioButton(driver, 3);
	//		GameFrstRound.GameFrstRound(driver);
	//		GameSecondRound.GameSecondRound(driver);
	//		GameThirdRound.GameThirdRound(driver);
	//		driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[2]")).click();
	//		//        Thread.sleep(3000);

	//
	//	}
	//
	//	@Test
	//	void FirstRadioButtonTest() {
	//
	//		QnAone.QnAone(driver, "a", "a","b","c","d");
	//		AnswerRadioButton.RadioButton(driver, 1);
	//		QnAtwo.QnAtwo(driver,"b","b","g","r","u");
	//		AnswerRadioButton.RadioButton(driver, 1);
	//		QnAthree.QnAthree(driver,"c","c","j","w","q");
	//		AnswerRadioButton.RadioButton(driver, 1);
	//		driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
	//		InGameRadioButton.RadioButton(driver, 1, 1);
	//		InGameRadioButton.RadioButton(driver, 2, 1);
	//		InGameRadioButton.RadioButton(driver, 3, 1);
	//		//        Thread.sleep(3000);
	//
	//	}
	//	
	//	@Test
	//	void SecondRadioButtonTest() {
	//
	//		QnAone.QnAone(driver, "a", "a","b","c","d");
	//		AnswerRadioButton.RadioButton(driver, 2);
	//		QnAtwo.QnAtwo(driver,"b","b","g","r","u");
	//		AnswerRadioButton.RadioButton(driver, 2);
	//		QnAthree.QnAthree(driver,"c","c","j","w","q");
	//		AnswerRadioButton.RadioButton(driver, 2);
	//		driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
	//		InGameRadioButton.RadioButton(driver, 1, 1);
	//		InGameRadioButton.RadioButton(driver, 2, 1);
	//		InGameRadioButton.RadioButton(driver, 3, 1);
	//		//        Thread.sleep(3000);

	//	}
	//	
	//	@Test
	//	void ThirdRadioButtonTest() {
	//
	//		QnAone.QnAone(driver, "a", "a","b","c","d");
	//		AnswerRadioButton.RadioButton(driver, 3);
	//		QnAtwo.QnAtwo(driver,"b","b","g","r","u");
	//		AnswerRadioButton.RadioButton(driver, 3);
	//		QnAthree.QnAthree(driver,"c","c","j","w","q");
	//		AnswerRadioButton.RadioButton(driver, 3);
	//		driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
	//		InGameRadioButton.RadioButton(driver, 1, 1);
	//		InGameRadioButton.RadioButton(driver, 2, 1);
	//		InGameRadioButton.RadioButton(driver, 3, 1);
	//		//        Thread.sleep(3000);
	//
	//	}
	//
	@Test
	void IfThePageIsCorrect() {
		
		TriviaQuestion.TriviaQuestion(driver, "a");
		driver.findElement(By.id("nextquest")).click();
		
		if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true) {
			
			TriviaAnswers.TriviaAnswers(driver, "a", "b", "c", "d");
			AnswerRadioButton.RadioButton(driver, 1);
			driver.findElement(By.id("nextquest")).click();
			if(driver.getPageSource().contains("question number: 2")==true) {
				TriviaQuestion.TriviaQuestion(driver, "b");
				driver.findElement(By.id("nextquest")).click();
				if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true) {
					TriviaAnswers.TriviaAnswers(driver, "d", "b", "f", "w");
					AnswerRadioButton.RadioButton(driver, 2);
					driver.findElement(By.id("nextquest")).click();
					if(driver.getPageSource().contains("question number: 3")==true) {
						TriviaQuestion.TriviaQuestion(driver, "c");
						driver.findElement(By.id("nextquest")).click();
						if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true) {
							TriviaAnswers.TriviaAnswers(driver, "t", "i", "c", "q");
							AnswerRadioButton.RadioButton(driver, 3);
							driver.findElement(By.id("nextquest")).click();
							if(driver.getPageSource().contains("You finished to build the test")==true) {
								driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
								if(driver.getPageSource().contains("Test")==true) {
									InGameRadioButton.RadioButton(driver, 1, 3);
									driver.findElement(By.id("btnnext")).click();
									if(driver.getPageSource().contains("Test")==true) {
										InGameRadioButton.RadioButton(driver, 2, 2);
										driver.findElement(By.id("btnnext")).click();
										if(driver.getPageSource().contains("Test")==true) {
											InGameRadioButton.RadioButton(driver, 3, 1);
											driver.findElement(By.id("btnnext")).click();
											if(driver.getPageSource().contains("Sucsses")==true) {
												driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[2]")).click();
											}	
										}	
									}
								}
							}
						}	
					}	
				}
			}
			
		}
		System.out.println("The test has failed");

	}
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

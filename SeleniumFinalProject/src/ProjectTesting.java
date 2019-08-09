

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class ProjectTesting {

	WebDriver Cdriver = new ChromeDriver();
	//	WebDriver Fdriver = new FirefoxDriver();


	@BeforeEach
	void beforAllClass() throws InterruptedException {
		Cdriver.manage().window().maximize();
		Cdriver.get("https://svcollegetest.000webhostapp.com/");
		Cdriver.findElement(By.id("startB")).click();
	}

	@AfterEach
	void closeBrowser() {
		Cdriver.quit();
	}

	@Test
	void ChromeSanity(){

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}


	//Boundary Values Test
	@Test
	void FirstQnABVMultiply5(){

		QnAone.QnAone(Cdriver, "aaaaa", "aaaaa","bbbbb","ccccc","ddddd");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}

	@Test
	void SecondQnABVMultiply5(){	
		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"bbbbb","ggggg","bbbbb","rrrrr","uuuuu");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}

	@Test
	void ThirdQnABVMultiply5(){	
		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"ccccc","wwwww","jjjjj","ccccc","qqqqq");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);


	}

	@Test
	void FirstQnABVMultiply10(){

		QnAone.QnAone(Cdriver, "aaaaaaaaaa", "aaaaaaaaaa","bbbbbbbbbb","cccccccccc","dddddddddd");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);
	}	

	@Test
	void SecondQnABVMultiply10(){

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"bbbbbbbbbb","gggggggggg","bbbbbbbbbb","rrrrrrrrrr","uuuuuuuuuu");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}

	@Test
	void ThirdQnABVMultiply10(){


		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"cccccccccc","wwwwwwwwww","jjjjjjjjjj","cccccccccc","qqqqqqqqqq");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}

	@Test
	void FirstQnABVMultiply20(){
		
		QnAone.QnAone(Cdriver, "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa","bbbbbbbbbbbbbbbbbbbb","cccccccccccccccccccc","dddddddddddddddddddd");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}
	
	@Test
	void SecondQnABVMultiply20(){
		
		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"bbbbbbbbbbbbbbbbbbbb","gggggggggggggggggggg","bbbbbbbbbbbbbbbbbbbb","rrrrrrrrrrrrrrrrrrrr","uuuuuuuuuuuuuuuuuuuu");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}
	
	@Test
	void ThirdQnABVMultiply20(){

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"cccccccccccccccccccc","wwwwwwwwwwwwwwwwwwww","jjjjjjjjjjjjjjjjjjjj","cccccccccccccccccccc","qqqqqqqqqqqqqqqqqqqq");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}

	@Test
	void FirstQnABVMultiply40() {

		QnAone.QnAone(Cdriver, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","cccccccccccccccccccccccccccccccccccccccc","dddddddddddddddddddddddddddddddddddddddd");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}
	
	@Test
	void SecondQnABVMultiply40() {
		
		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","gggggggggggggggggggggggggggggggggggggggg","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb","rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr","uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}
	
	@Test
	void ThirdQnABVMultiply40() {

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"cccccccccccccccccccccccccccccccccccccccc","wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww","jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj","cccccccccccccccccccccccccccccccccccccccc","qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);

		assertEquals(true, Cdriver.getPageSource().contains("Sucsses")==true);

	}

	//Functionality Test
	@Test
	void PopUpFirstMessage() {

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		Cdriver.findElement(By.id("nextquest")).click();

	}

	@Test
	void PopUpSecondMessage() {

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		Cdriver.findElement(By.id("nextquest")).click();


	}

	@Test
	void PopUpThirdMessage() {

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		Cdriver.findElement(By.id("nextquest")).click();


	}

	@Test
	void IsFirstWebPageTurn() throws InterruptedException {
		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		if(Cdriver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
			Thread.sleep(1000);
			Cdriver.findElement(By.name("question")).sendKeys("b");
			Cdriver.findElement(By.id("backquest")).click();
		}



	}

	@Test
	void IsSecondWebPageTurn() throws InterruptedException {
		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		if(Cdriver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
			Thread.sleep(1000);
			Cdriver.findElement(By.name("question")).sendKeys("b");
			Cdriver.findElement(By.id("backquest")).click();
		}


	}

	@Test
	void IsThirdWebPageTurn() throws InterruptedException {
		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		if(Cdriver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).isEnabled()==true){
			Cdriver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[2]")).click();
		}


	}

	@Test
	void IsFirstQnASaved() {
		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		Cdriver.findElement(By.id("backquest")).click();
		if(Cdriver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!")==true) {
			String firstQnA = Cdriver.findElement(By.name("answer1")).getAttribute("value");
			if (firstQnA.equalsIgnoreCase(" ")) {
				System.out.println("Answer test failed");
			}
			else {
				Cdriver.findElement(By.id("backquest")).click();
				if(Cdriver.getPageSource().contains("Please type here your question")==true) {
					String firstQuestion = Cdriver.findElement(By.name("question")).getAttribute("value");
					if (firstQuestion.equalsIgnoreCase(" ")) {
						System.out.println("question test failed");				}
					else {
						System.out.println("The test has passed");
					}
				}
			}
		}	

	}

	@Test
	void IsSecondQnASaved() {
		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver, "b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		Cdriver.findElement(By.name("question")).sendKeys("a");
		Cdriver.findElement(By.id("backquest")).click();

		if(!Cdriver.getPageSource().contains("question number: 3")==true) {
			String secondQnA = Cdriver.findElement(By.name("answer1")).getAttribute("value");
			if (secondQnA.equalsIgnoreCase(" ")) {
				System.out.println("Answer test failed");
			}
			else {
				Cdriver.findElement(By.id("backquest")).click();
				if(!Cdriver.getPageSource().contains("question number: 3")==true) {
					String secondQuestion = Cdriver.findElement(By.name("question")).getAttribute("value");
					if (secondQuestion.equalsIgnoreCase(" ")) {
						System.out.println("question test failed");				}
					else {
						System.out.println("The test has passed");
					}
				}
			}
		}
		System.out.println("The test has failed");

	}



	@Test
	void TestWithNumbers() {

		QnAone.QnAone(Cdriver, "a", "1","3","7","9");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","5","7","3","9");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","85","78","99","45");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);


	}

	@Test
	void FaildQuastionTest() {

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","g","b","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","w","j","c","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		Cdriver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();

		InGameRadioButton.RadioButton(Cdriver, 1, 4);
		InGameRadioButton.RadioButton(Cdriver, 2, 4);
		InGameRadioButton.RadioButton(Cdriver, 3, 4);



	}
	@Test
	void StartNewGame() {

		QnAone.QnAone(Cdriver, "a", "1","3","7","9");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","5","7","3","9");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","85","78","99","45");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);
		Cdriver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[1]")).click();



	}

	@Test
	void CloseGame() {

		QnAone.QnAone(Cdriver, "a", "1","3","7","9");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","5","7","3","9");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","85","78","99","45");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		GameFrstRound.GameFrstRound(Cdriver);
		GameSecondRound.GameSecondRound(Cdriver);
		GameThirdRound.GameThirdRound(Cdriver);
		Cdriver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[2]")).click();



	}

	@Test
	void FirstRadioButtonTest() {

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAtwo.QnAtwo(Cdriver,"b","b","g","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		QnAthree.QnAthree(Cdriver,"c","c","j","w","q");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		Cdriver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
		InGameRadioButton.RadioButton(Cdriver, 1, 1);
		InGameRadioButton.RadioButton(Cdriver, 2, 1);
		InGameRadioButton.RadioButton(Cdriver, 3, 1);


	}

	@Test
	void SecondRadioButtonTest() {

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAtwo.QnAtwo(Cdriver,"b","b","g","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		QnAthree.QnAthree(Cdriver,"c","c","j","w","q");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		Cdriver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
		InGameRadioButton.RadioButton(Cdriver, 1, 1);
		InGameRadioButton.RadioButton(Cdriver, 2, 1);
		InGameRadioButton.RadioButton(Cdriver, 3, 1);


	}

	@Test
	void ThirdRadioButtonTest() {

		QnAone.QnAone(Cdriver, "a", "a","b","c","d");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		QnAtwo.QnAtwo(Cdriver,"b","b","g","r","u");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		QnAthree.QnAthree(Cdriver,"c","c","j","w","q");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		Cdriver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
		InGameRadioButton.RadioButton(Cdriver, 1, 1);
		InGameRadioButton.RadioButton(Cdriver, 2, 1);
		InGameRadioButton.RadioButton(Cdriver, 3, 1);


	}

	@Test
	void IsPageCorrectForFirsQnA() throws InterruptedException {

		TriviaQuestion.TriviaQuestion(Cdriver, "a");
		Cdriver.findElement(By.id("nextquest")).click();

		if(Cdriver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true) {

			TriviaAnswers.TriviaAnswers(Cdriver, "a", "b", "c", "d");
			AnswerRadioButton.RadioButton(Cdriver, 1);
			Cdriver.findElement(By.id("nextquest")).click();
			if(Cdriver.getPageSource().contains("question number: 2")==true) {
				TriviaQuestion.TriviaQuestion(Cdriver, "b");
				Cdriver.findElement(By.id("nextquest")).click();

				Cdriver.findElement(By.id("backquest")).click();
				if(Cdriver.getPageSource().contains("Please type here your question")==true) {
					Cdriver.findElement(By.id("backquest")).click();
					if(Cdriver.getPageSource().contains("question number: 1")==true) {
						System.out.println("The test for first QnA passed");
						Cdriver.quit();
					}
				}				
			}
		}
	}

	@Test
	void IsPageCorrectForSecondQnA() {
		TriviaQuestion.TriviaQuestion(Cdriver, "a");
		Cdriver.findElement(By.id("nextquest")).click();
		TriviaAnswers.TriviaAnswers(Cdriver, "a", "b", "c", "d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		Cdriver.findElement(By.id("nextquest")).click();
		if(Cdriver.getPageSource().contains("question number: 2")==true) {
			TriviaQuestion.TriviaQuestion(Cdriver, "b");
			Cdriver.findElement(By.id("nextquest")).click();
			if(Cdriver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true) {
				TriviaAnswers.TriviaAnswers(Cdriver, "e", "b", "g", "y");
				AnswerRadioButton.RadioButton(Cdriver, 2);
				Cdriver.findElement(By.id("nextquest")).click();
				if(Cdriver.getPageSource().contains("question number: 3")==true) {
					TriviaQuestion.TriviaQuestion(Cdriver, "c");
					Cdriver.findElement(By.id("backquest")).click();
					if(Cdriver.getPageSource().contains("question number: 2")==true) {
						System.out.println("The test for second QnA passed");
						Cdriver.quit();
					}
					System.out.println("The test for second QnA has failed");
				}
			}
		}
	}

	@Test
	void IsPageCorrectForThirdQnA() throws InterruptedException {
		TriviaQuestion.TriviaQuestion(Cdriver, "a");
		Cdriver.findElement(By.id("nextquest")).click();
		TriviaAnswers.TriviaAnswers(Cdriver, "a", "b", "c", "d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		Cdriver.findElement(By.id("nextquest")).click();
		TriviaQuestion.TriviaQuestion(Cdriver, "b");
		Cdriver.findElement(By.id("nextquest")).click();
		TriviaAnswers.TriviaAnswers(Cdriver, "e", "b", "g", "y");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		Cdriver.findElement(By.id("nextquest")).click();
		System.out.println("1");
		if(Cdriver.getPageSource().contains("question number: 3")==true) {
			TriviaQuestion.TriviaQuestion(Cdriver, "c");
			Cdriver.findElement(By.id("nextquest")).click();
			System.out.println("2");
			if(Cdriver.getPageSource().contains("Please enter 4 possible answers and Mark the right one")==true) {
				System.out.println("2.1");
				TriviaAnswers.TriviaAnswers(Cdriver, "t", "e", "c", "u");
				System.out.println("2.2");
				AnswerRadioButton.RadioButton(Cdriver, 3);
				System.out.println("2.3");
				Thread.sleep(3000);
				Cdriver.findElement(By.id("nextquest")).click();
				System.out.println("3");
				if(Cdriver.getPageSource().contains("You finished")==true) {
					System.out.println("The test for second QnA passed");
					Cdriver.quit();
				}
				System.out.println("The test for second QnA has failed");
			}
		}
	}

	@Test
	void IsPageCorrectForFirstGamePage() throws InterruptedException {
		TriviaQuestion.TriviaQuestion(Cdriver, "a");
		Cdriver.findElement(By.id("nextquest")).click();
		TriviaAnswers.TriviaAnswers(Cdriver, "a", "b", "c", "d");
		AnswerRadioButton.RadioButton(Cdriver, 1);
		Cdriver.findElement(By.id("nextquest")).click();
		TriviaQuestion.TriviaQuestion(Cdriver, "b");
		Cdriver.findElement(By.id("nextquest")).click();
		TriviaAnswers.TriviaAnswers(Cdriver, "e", "b", "g", "y");
		AnswerRadioButton.RadioButton(Cdriver, 2);
		Cdriver.findElement(By.id("nextquest")).click();
		TriviaQuestion.TriviaQuestion(Cdriver, "c");
		Cdriver.findElement(By.id("nextquest")).click();
		TriviaAnswers.TriviaAnswers(Cdriver, "t", "e", "c", "u");
		System.out.println("1");
		AnswerRadioButton.RadioButton(Cdriver, 3);
		System.out.println("2");
		Cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Cdriver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		if(Cdriver.getPageSource().contains("finished")==true) {
			System.out.println("4");
			Cdriver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
			if(Cdriver.getPageSource().contains("Test")==true)
				System.out.println("The test for second QnA passed");
			Cdriver.quit();
		}
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
	//Compatibility
	//	@Test
	//	void FirefoxCompatibility() {
	//
	//
	//		QnAone.QnAone(Fdriver, "a", "a","b","c","d");
	//		AnswerRadioButton.RadioButton(Fdriver, 1);
	//		QnAtwo.QnAtwo(Fdriver,"b","g","b","r","u");
	//		AnswerRadioButton.RadioButton(Fdriver, 2);
	//		QnAthree.QnAthree(Fdriver,"c","w","j","c","q");
	//		AnswerRadioButton.RadioButton(Fdriver, 3);
	//		GameFrstRound.GameFrstRound(Fdriver);
	//		GameSecondRound.GameSecondRound(Fdriver);
	//		GameThirdRound.GameThirdRound(Fdriver);
	//
	//		assertEquals(true, Fdriver.getPageSource().contains("Sucsses")==true);
	//
	//
	//
	//	}



}

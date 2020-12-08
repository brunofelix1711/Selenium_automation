package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opengoogledefinition {
 WebDriver driver;
	

		@Given("user is launching google website")
		public void user_is_launching_google_website() {
		    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("https://www.google.com/");
		    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		  // throw new io.cucumber.java.PendingException();
		}


		//Some other steps were also undefined:

		@When("user is entering {string}")
		public void user_is_entering(String entering) {
		  WebElement search=  driver.findElement(By.name("q"));
		  search.sendKeys(entering);
		  
		  
		  //  throw new io.cucumber.java.PendingException();
		}
		@When("user is clicking search")
		public void user_is_clicking_search() {
			 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			
		   // throw new io.cucumber.java.PendingException();
		}

		
			
			}




	

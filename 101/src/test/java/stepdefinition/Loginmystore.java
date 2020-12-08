package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Loginmystore {

	WebDriver driver;

		@Given("user launch the application")
		public void user_launch_the_application() {
		    // Write code here that turns the phrase above into concrete actions
		 //  throw new io.cucumber.java.PendingException();
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
		}
		
	
	
			@Then("click on the login button")
			public void click_on_the_login_button() {
				WebElement button=driver.findElement(By.xpath("(//*[@href='http://automationpractice.com/index.php?controller=my-account'])[1]"));
				button.click();
			  //  throw new io.cucumber.java.PendingException();
			}

			
			
				@When("user is enter {string}")
				public void user_is_enter(String username) {
				    
				  //  throw new io.cucumber.java.PendingException();
					driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

					WebElement x=driver.findElement(By.xpath("//*[@id='email']"));
					 x.sendKeys(username);
				}

				
					@When("user enters {string}")
					public void user_enters(String password) {
						//WebDriverWait wait=new WebDriverWait(driver, 100);
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='passwd']"));
						WebElement y=driver.findElement(By.xpath("//*[@id='passwd']"));
						y.sendKeys(password);
					   // throw new io.cucumber.java.PendingException();
					}
					
					@Then("user clicks on the button")
					public void user_clicks_on_the_button() {
						driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
						//JavascriptExecutor js=(JavascriptExecutor) driver;
						//js.executeScript("window.scrollby(0,300)");
					    // Write code here that turns the phrase above into concrete actions
					   // throw new io.cucumber.java.PendingException();
						WebElement submit=driver.findElement(By.xpath("//*[@name='SubmitLogin']"));
						submit.click();
						Assert.assertTrue(true);
					}
}









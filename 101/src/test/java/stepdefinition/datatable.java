package stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class datatable {
	
	WebDriver driver;

		@Given("i start the application")
		public void i_start_the_application() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			WebDriverWait wait=new WebDriverWait(driver,2000);
			WebElement a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@href='http://automationpractice.com/index.php?controller=my-account'])[1]")));
			a.click();
			
		}


		

		@Then("i pass the below credentials")
		public void i_pass_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		    //
		    // For other transformations you can register a DataTableType.
		    //throw new io.cucumber.java.PendingException();
			
			
			List<Map<String, String>> list=dataTable.asMaps(String.class,String.class);
			for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).get("username"));
			System.out.println(list.get(i).get("password"));
			System.out.println(list.get(i).get("username"));
			System.out.println(list.get(i).get("password"));
			
			driver.manage().timeouts().implicitlyWait(90000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(list.get(i).get("username"));	
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(list.get(i).get("password"));
		WebElement submit=driver.findElement(By.xpath("//*[@name='SubmitLogin']"));
		submit.click();
		driver.manage().timeouts().implicitlyWait(900000, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[@title='Log me out']")).click();
			}
		
		}
			


		}






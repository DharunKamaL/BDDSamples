package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	WebDriver driver;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.id("login2")).click();
	}
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//	    driver.findElement(By.id("loginusername")).sendKeys("Dharun_K");
//	    driver.findElement(By.id("loginpassword")).sendKeys("dkvk2315");
//	    driver.findElement(By.cssSelector("button[onclick=\"logIn()\"]")).click();
//	    
//	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
		driver.findElement(By.cssSelector("button[onclick=\"logIn()\"]")).click();
	}

	 //Using datatable as lists
//	@When("User enters credentials")
//	public void user_enters_credentials(DataTable dataTable) {
//		List<List<String>> data = dataTable.asLists();
//		int dsize = data.size();
//		int i = 0;
//		int j = 1;
//		for(List datas:data) {
//			if(datas.size() < dsize) {
//				datas.get(i).get(j);
//			}
//		}
//		String username = data.get(0).get(0);
//		String password = data.get(0).get(1);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		driver.findElement(By.id("loginusername")).sendKeys(username);
//		driver.findElement(By.id("loginpassword")).sendKeys(password);
//		driver.findElement(By.cssSelector("button[onclick=\"logIn()\"]")).click();
//
//	}

//	// Using datatable as Maps
	@When("User enters credentials")
	public void user_enters_credentials(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps();
		String username = data.get(0).get("uname");
		String password = data.get(0).get("pword");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
		driver.findElement(By.cssSelector("button[onclick=\"logIn()\"]")).click();

	}

	@Then("should display Home Page")
	public void should_display_home_page() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		WebElement wel = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
		Assert.assertEquals(wel.getText(), "Welcome Dharun_K");
	}
}

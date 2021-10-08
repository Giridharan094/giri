package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class OpenGoogleDefinitions {
	
	WebDriver driver;
	
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.google.co.in");
	    
	}

	@When("^user is tying search word \"([^\"]*)\"$")
	public void user_is_tying_search_word(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(arg1);
	    
	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^user should able to see the search results$")
	public void user_should_able_to_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	boolean Status =driver.findElement(By.partialLinkText("Gi")).isDisplayed();
	
if(Status) {
	System.out.println("Result is displayed");
}
}
	   
	}




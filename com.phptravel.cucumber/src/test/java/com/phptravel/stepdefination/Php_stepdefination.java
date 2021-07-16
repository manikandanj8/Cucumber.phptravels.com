package com.phptravel.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Php_stepdefination {

	WebDriver driver;

	@Given("^User is in the login page$")
	public void user_is_in_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
	}

	@When("^Entering \"([^\"]*)\" and \"([^\"]*)\"$")
	public void entering_and(String username, String password) throws Throwable {

		WebElement username1 = driver.findElement(By.xpath("//input[@name='username']"));
		username1.sendKeys(username);
		WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys(password);
	}

	@And("^clicking the login button$")
	public void clicking_the_login_button() throws Throwable {

		WebElement button = driver
				.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']"));
		button.click();

	}

	@Then("^user successfully loggedin and loggout$")
	public void user_successfully_loggedin_and_loggout() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);

		Boolean verify = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div/span"))
				.isDisplayed();

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div/span")).getText();

		if (verify) {
			System.out.println("login was successfully");
		}

	}
}

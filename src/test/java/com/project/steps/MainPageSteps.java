package com.project.steps;

import com.pages.MainPageView;
import com.project.basics.TestBase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageSteps extends TestBase {
	private final MainPageView mainPageView = new MainPageView();
	WebDriverWait wait = new WebDriverWait(driver, 200);
	
	@When("I click the login button")
	public void iClickLoginButton() {
		driver.findElement(By.cssSelector(mainPageView.getLogin())).click();
	}

	@Then("Header name is {string}")
     public void iOpenUrl(String name) {
		Assert.assertEquals(driver.findElement(By.cssSelector(mainPageView.getUsername())).getText(), name);
			}

}

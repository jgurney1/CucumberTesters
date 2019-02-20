package com.qa.CucumberTests2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	@FindBy(xpath = "//*[@id=\"sb_form_q\"]")
	private WebElement searchbar;
	
	@FindBy(xpath = "//*[@id=\"sb_form_go\"]")
	private WebElement searchButton;
	
	public void inputSearch(String arg1) {
		searchbar.sendKeys(arg1);
	}
	
	public void submit() {
		searchButton.click();
	}
	
}

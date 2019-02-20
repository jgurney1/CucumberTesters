package com.qa.CucumberTests2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchedPage {

	
@FindBy(xpath = "//*[@id=\"b_context\"]/li[1]/div/div[1]/h2")
private WebElement result;

public boolean checkResult(String expected) {
	if (expected.equals(result.getText())) {
		return true;
	}
	return false;
}
}

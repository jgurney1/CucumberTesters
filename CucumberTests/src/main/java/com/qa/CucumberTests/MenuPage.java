package com.qa.CucumberTests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
	
	@FindAll({@FindBy(tagName = "strong")})
	private List<WebElement> list;
	
	
	
	public Boolean isListPresent() {
		System.out.println(list.size());
		if(list.size() == 3) {
			return true;
		}
		return false;
	}

}

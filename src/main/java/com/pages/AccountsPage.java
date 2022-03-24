package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	
	//1. By Locators:
	private By accountSections = By.cssSelector("div#center_column span");
	
	//2. Constructor of the page class:
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//3. page actions: features(behavior) of the page the form of methods:
	
	public  String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
	public int getAccountsSectionCount() {
		return driver.findElements(accountSections).size()-1;
	}

	public  List<String> getAccountsSectionsList() {
		
		List<String> accountsList = new ArrayList<>();
		List<WebElement> accountsHeaderList = driver.findElements(accountSections);
		
		for(WebElement  e : accountsHeaderList) {
			String text = e.getText();
			System.out.println(text);
			accountsList.add(text);
		}
		
		return accountsList;
	}
}

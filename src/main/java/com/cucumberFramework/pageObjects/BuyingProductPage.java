package com.cucumberFramework.pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class BuyingProductPage {
	private WebDriver driver;
	
	@FindBy(xpath="//a[text()='APPLE Airpods Pro With Wireless Charging Case Active no...']")
	public WebElement itemToBuy;
	
	@FindBy(xpath="//button[text()='BUY NOW']")
	public WebElement buyNowButton;
	
	@FindBy(xpath="//button[text()='Deliver Here']")
	public WebElement deliverHereButton;
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	public WebElement continueButton;
	
	WaitHelper waitHelper;

	public BuyingProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void selectingItemToBuy() {
		
		itemToBuy.click();
	}
	
	public void clickBuyNow() {
		
		buyNowButton.click();
	}
	public void clickdeliverHere() {
		deliverHereButton.click();
	}
	public void clickContinue() {
		continueButton.click();
	}
		public void switchTab() {
			
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    
		
	}
		public void clickItemToBuy() {
			itemToBuy.click();
		}
}

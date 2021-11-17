package com.cucumberFramework.pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

import junit.framework.Assert;

public class FlipkartEndToEndTestPage {

	private WebDriver driver;

	WaitHelper waitHelper;

	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	public WebElement logInCloseButton;

	@FindBy(xpath = "//a[text()='Login']")
	public WebElement logInButton;

	@FindBy(xpath = "//div[text()='shiju']")
	public WebElement loggedInUser;

	@FindBy(xpath = "//a[text()='TP-Link Archer C20 750 MBPS Wireless Router']")
	public WebElement itemToAdd;

	@FindBy(xpath = "//span[text()='Place Order']")
	public WebElement placeOrderButton;

	@FindBy(xpath = "//button[text()='Deliver Here']")
	public WebElement deliverHereButton;

	@FindBy(xpath = "//span[text()='Cart']")
	public WebElement cartButton;

	public FlipkartEndToEndTestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	public void clickLogInCloseButton() {

		logInCloseButton.click();
	}

	public void verifyLogInButton() {

		logInButton.isDisplayed();
	}

	public void clickLogInButton() {

		logInButton.click();
	}

	public void verifyLoggedUser() {

		loggedInUser.isDisplayed();
	}

	public void selectingItem() {

		itemToAdd.click();

	}

	public void verifyPlaceOrderButton() {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		waitHelper.WaitForElement(placeOrderButton, 60);
		placeOrderButton.isDisplayed();
	}

	public void clickPlaceOrderButton() {

		placeOrderButton.click();
	}

	public void verifyDeliverHereButton() {
		deliverHereButton.isDisplayed();
	}
}

package com.cucumberFramework.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class SauceDemoPage {

	private WebDriver driver;

	@FindBy(id = "login-button")
	public WebElement logInButton;

	@FindBy(id = "user-name")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	public WebElement cartIcon;

	@FindBy(xpath = "//select[@class='product_sort_container']")
	public WebElement sorting;

	@FindBy(xpath = "//option[text()='Price (low to high)']")
	public WebElement priceSort;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	public WebElement item1;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	public WebElement item2;

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	public WebElement item3;

	@FindBy(id = "checkout")
	public WebElement checkoutButton;

	@FindBy(id = "continue")
	public WebElement continueButton;

	@FindBy(id = "first-name")
	public WebElement firstname;

	@FindBy(id = "last-name")
	public WebElement lastname;

	@FindBy(id = "postal-code")
	public WebElement zipcode;

	@FindBy(id = "finish")
	public WebElement finishbutton;

	@FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")
	public WebElement ordersuccessfull;

	WaitHelper waitHelper;

	public SauceDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		// waitHelper.WaitForElement(userName, 60);
	}

	public boolean verifyLogInPage() {

		logInButton.isDisplayed();
		return true;
	}

	public void enterUsername(String uname) {

		username.sendKeys(uname);
	}

	public void enterPassword(String pword) {

		password.sendKeys(pword);

	}

	public boolean verifyUserLoggedIn() {

		cartIcon.isDisplayed();
		return true;
	}

	public void sortingItems() {

		sorting.click();
		priceSort.click();
	}

	public void addingItemsToCart() {

		item1.click();
		item2.click();
		item3.click();
	}

	public void verifyCartItems() {

		cartIcon.click();
		Assert.assertEquals("3", cartIcon.getText());

	}

	public boolean verifyCheckOutButton() {

		checkoutButton.isDisplayed();
		return true;

	}

	public void clickCheckoutButton() {

		checkoutButton.click();
	}

	public boolean verifyContinueButton() {

		continueButton.isDisplayed();
		return true;
	}

	public void clickContinueButton() {

		continueButton.click();
	}

	public void addingAddress(String fname, String lname, String zip) {

		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		zipcode.sendKeys(zip);

	}

	public boolean verifyFinishButton() {

		finishbutton.isDisplayed();
		return true;
	}

	public void clickFinishButton() {

		finishbutton.click();
	}

	public boolean verifyordersuccessfull() {

		ordersuccessfull.isDisplayed();
		return true;
	}
}

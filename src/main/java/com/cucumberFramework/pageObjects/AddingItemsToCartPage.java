package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class AddingItemsToCartPage {

	private WebDriver driver;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement Continue;

	@FindBy(id = "nav-search-submit-button")
	public WebElement searchButton;

	@FindBy(xpath = "//span[text()='OnePlus Nord CE 5G (Charcoal Ink, 8GB RAM, 128GB Storage)']")
	public WebElement mobilePhone;

	@FindBy(id = "add-to-cart-button")
	public WebElement addToCart;
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement loginButton;
	
	@FindBy(xpath="//span[contains(text(),'Sign')]/parent::a")
	public WebElement logoutBtn;
	
	@FindBy(xpath="//div[@id='nav-tools']/a[@data-nav-role='signin']")
	WebElement SignInfromNav;

	WaitHelper waitHelper;

	public AddingItemsToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void clickSignInButton(){
		Actions builder = new Actions(driver);
		builder.moveToElement(SignInfromNav).build().perform();
		SignInfromNav.click();
	}
	
	public void enterUserName(String userName){
		this.userName.sendKeys(userName);
	}
	
	public void enterPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}
	
	public void clickContinueButton(){
		Continue.click();
	}
}

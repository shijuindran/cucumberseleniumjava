package com.cucumberFramework.pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumberFramework.helper.WaitHelper;

public class FlipkartLogInPage {

	private WebDriver driver;
	WaitHelper waitHelper;
	
	@FindBy(xpath="//a[text()='Login']")
	public WebElement logIn;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	public WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	public WebElement submit;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchButton;
	
	@FindBy(xpath="//a[text()='APPLE Airpods Pro With Wireless Charging Case Active no...']")
	public WebElement airpods;

	@FindBy(xpath="//input[@type='text']")
	public WebElement searchBox;
	
	@FindBy(xpath="//a[@title='APPLE Airpods Pro With Wireless Charging Case Active noise cancellation enabled Bluetooth Headset']")
	public WebElement appAirPod;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	public WebElement addToCart;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[5]/div/div/a/div")
	public WebElement cartCount;
	
	@FindBy(xpath="//div[text()='Remove']")
	public WebElement removeCartItem;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div/div[3]/div/div[2]")
	public WebElement confirmRemoveCartItem;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[5]/div/div/a")
	public WebElement navCart;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div")
	public WebElement name;
	
	@FindBy(xpath="//*[text()='Logout']")
	public WebElement logOut;
	
	public FlipkartLogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void enterUserNameFlipkart(String userName){
		this.userName.sendKeys(userName);
	}
	
	public void enterPasswordFlipkart(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginButtonFlipkart(){
		
		logIn.click();
	}
	
	public void clickSubmitButtonFlipkart(){
		submit.click();
	}
	
	public void addApplAirPodToTheCart() throws Throwable{
		appAirPod.click();
	}
	
	public void addToCart() throws Throwable{
		addToCart.click();
	}
	
	public void searchingItemsFlipkart(String airpods) {
		this.searchBox.sendKeys(airpods);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchButton.click();
	}
	public void cartVerification(String a) {
		
		 String s = cartCount.getText();
		  assertEquals(s, a);
	}
	public void removingCartItem() {
		
		navCart.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		removeCartItem.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		confirmRemoveCartItem.click();
		
	}
	public void cartRemovingVerification() {
		
		 String s = cartCount.getText();
		  assertEquals(s, "0");
	}
	public void logOut() {
		
		Actions builder = new Actions(driver);
		builder.moveToElement(name).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logOut.click();
	}
}

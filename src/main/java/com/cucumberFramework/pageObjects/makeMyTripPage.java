package com.cucumberFramework.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class makeMyTripPage {
	
	private WebDriver driver;

	WaitHelper waitHelper;
	
	@FindBy(id="fromCity")
	public WebElement departure;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
	public WebElement departureSearchBox;
	
	@FindBy(xpath="//p[text()='Kochi, India']")
	public WebElement kochi;
	
	@FindBy(id="toCity")
	public WebElement arrival;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")
	public WebElement arrivalSearchBox;
	
	@FindBy(xpath="//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")
	public WebElement chennai;
	
	@FindBy(xpath="//*[@id=\'root\']/div/div[2]/div/div/div[1]/ul/li[1]")
	public WebElement oneWay;
	
	@FindBy(xpath="//div[@id='root']/div/div[2]/div[1]/div/div[2]/div[1]/div[3]")
	public WebElement date;
	
	@FindBy(xpath="//div[@aria-label='Wed Nov 24 2021']")
	public WebElement day;
	
	@FindBy(xpath="//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]")
	public WebElement logIn;
	
	@FindBy(xpath="//a[text()='Search']")
	public WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/label")
	public WebElement passengers;
	
	@FindBy(xpath="//li[@data-cy='adults-2']")
	public WebElement passengerCount;
	
	@FindBy(xpath="//button[text()='APPLY']")
	public WebElement applyButton;
	
	public makeMyTripPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void departureCity() {
		
		departure.click();
		waitHelper.WaitForElement(departureSearchBox, 20);
		departureSearchBox.sendKeys("Kochi");
		waitHelper.WaitForElement(kochi, 20);
		kochi.click();
	}

	public void actionsClick(){
		Actions builder = new Actions(driver);
		builder.moveByOffset(329, 257).click().build().perform();
}
	
	public boolean verifyOneWayIsSelected() {
		
		oneWay.isSelected();
		return true;
		
	}
	
public void ArrivalCity() {
		
	waitHelper.WaitForElement(arrivalSearchBox, 20);
	arrivalSearchBox.sendKeys("Chennai");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	waitHelper.WaitForElement(chennai, 20);
	chennai.click();
	
	}
	public void selectingDate() {
		//waitHelper.WaitForElement(date, 20);
		//date.click();
		waitHelper.WaitForElement(day, 20);
		day.click();
		
	}
	
	public void clickSearchButton() {
	
		
		//logIn.click();
		waitHelper.WaitForElement(searchButton, 20);

		searchButton.click();
	}
	
	public void verifySearchPageisDisplayed() {
		
		System.out.println(driver.getTitle());
	}
	public void addPassengers() {
		
		waitHelper.WaitForElement(passengers, 20);
		passengers.click();
		waitHelper.WaitForElement(passengerCount, 20);
		passengerCount.click();
		waitHelper.WaitForElement(applyButton, 20);
		applyButton.click();
	}
}

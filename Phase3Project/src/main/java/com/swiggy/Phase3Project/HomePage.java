package com.swiggy.Phase3Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(xpath="//input[@placeholder='Enter your delivery location']")
	private WebElement Location;
	
	@FindBy(xpath="//span[normalize-space()='Udaipur, Rajasthan, India']")
	private WebElement SelectLocation;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void clickLocation()
	{
		Location.click();
	}
	public void enterLocation(String userid)
	{
		Location.sendKeys(userid);
	}
	public void hoverPointerOverselectlocation()
	{
		actions.moveToElement(SelectLocation).build().perform();
	}
	public void selectLocation()
	{
		wait.until(ExpectedConditions.visibilityOf(SelectLocation));
		SelectLocation.click();
	}

}

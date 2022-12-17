package com.swiggy.Phase3Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectFirstSearchResult 
{
	private WebDriverWait wait;
	
	@FindBy(xpath="(//div[contains(text(),'ADD')])[1]")
	private WebElement AddButton;
	
	@FindBy(xpath="//button[@class='_1gPB7']")
	private WebElement CheckoutButton;
	
	public SelectFirstSearchResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//actions=new Actions(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void selectAddButton()
	{
		wait.until(ExpectedConditions.visibilityOf(AddButton));
		AddButton.click();
	}
	public void selectCheckoutButton()
	{
		wait.until(ExpectedConditions.visibilityOf(CheckoutButton));
		CheckoutButton.click();
	}

}

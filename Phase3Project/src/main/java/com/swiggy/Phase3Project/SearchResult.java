package com.swiggy.Phase3Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchResult 
{
	//private Actions actions;
	private WebDriverWait wait;
	
	
	@FindBy(xpath="(//div[@class='_1HEuF'])[1]")
	private WebElement result;
	
	
	public SearchResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//actions=new Actions(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void selectSearchResult()
	{
		wait.until(ExpectedConditions.visibilityOf(result));
		result.click();
	}
	
}

package com.swiggy.Phase3Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage 
{
	private WebDriverWait wait;
	
	@FindBy(xpath="//div[@class='C6mS- y9pNN']")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//div[@class='_2axtv']")
	private WebElement errMsg;
	
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//actions=new Actions(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void selectLoginButton()
	{
		wait.until(ExpectedConditions.visibilityOf(LoginBtn));
		LoginBtn.click();
	}
	public String getErrMsg()
	{
		String message=errMsg.getText();
		return message;
	}

}

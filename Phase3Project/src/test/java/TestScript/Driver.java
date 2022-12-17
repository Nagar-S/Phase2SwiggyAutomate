package TestScript;

import org.openqa.selenium.chrome.ChromeDriver;

import com.swiggy.Phase3Project.CheckoutPage;
import com.swiggy.Phase3Project.HomePage;
import com.swiggy.Phase3Project.SearchResult;
import com.swiggy.Phase3Project.SelectFirstSearchResult;


public class Driver extends Tools
{
	protected static HomePage homePage;
	protected static SearchResult searchResult;
	protected static SelectFirstSearchResult selectResult;
	protected static CheckoutPage checkoutPage;
	public static void init()
	{
		System.setProperty("webdriver.chrome.driver", "Resources//chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.swiggy.com/");
		 homePage=new HomePage(driver);
		 searchResult=new SearchResult(driver);
		 selectResult=new SelectFirstSearchResult(driver);
		 checkoutPage=new CheckoutPage(driver);
	}
	
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHomePage {
	
	 WebDriver driver; 
	
	public googleHomePage(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "gLFyf")
	WebElement searchBox;
	
	@FindBy(className = "gNO89b")
	WebElement searchButton;
	
	@FindBy(id = "result-stats")
	WebElement searchResult; 
	
	
	public void enteringProductName(String product) {
		searchBox.sendKeys(product);
		
	}
	
	public void clickingOnSearchButton() {
		searchButton.click();
	}
	
	public boolean isSearchResultVisible() {
		
		return searchResult.isDisplayed();
	}
	

}

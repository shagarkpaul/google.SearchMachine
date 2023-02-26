package AdvanceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        
        Select s = new Select(dropdown);
        
        s.selectByIndex(2);
        
        s.selectByValue("1");
        
        s.selectByVisibleText("Option 2");
        
        
        List<WebElement> dropDownList = s.getOptions();
        
        //System.out.println(dropDownList);
        
        for(int i = 0; i < dropDownList.size(); i++ ) {
        	
        	String optionText = dropDownList.get(i).getText();
        	
        	System.out.println(optionText);
        }
        
        
        
        
	}

}

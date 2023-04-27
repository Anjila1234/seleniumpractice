package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver ();
		driver.get("https:/rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with select tag
		//index
		WebElement drop = driver.findElement(By.cssSelector("select[id=\"ctl00_mainContent_DropDownListCurrency\"]"));
		Select dropdown = new Select(drop);
		dropdown.selectByIndex(1);
		dropdown.getFirstSelectedOption().getText();
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());	
		
		//value
	dropdown.selectByValue("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());	
		
		
		
		
		
		
		
		
		
	}

}

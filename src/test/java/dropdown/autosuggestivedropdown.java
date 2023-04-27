package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.findElement(By.id("autosuggest")).sendKeys("ne");
	Thread.sleep(5000);
	
	List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	for (WebElement option : options) {
		if(option.getText().equalsIgnoreCase("Nepal")) {
			option.click();
			break;
		}
		System.out.println("pass");
	}
	
	
	
}
}

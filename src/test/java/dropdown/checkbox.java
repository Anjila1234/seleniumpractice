package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
	System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
	
	//total no of checkboxes
	System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

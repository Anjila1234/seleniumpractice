package javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class siblingparent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
		ChromeDriver driver = new 	ChromeDriver ();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");


//	/ - absolute xpath
// //- relative xpath

System.out.println(driver.findElement(By.xpath("//html/body/header/div/button[1]/following-sibling::button[1]")).getText());



System.out.println(driver.findElement(By.xpath("//html/body/header/div/button[1]/parent::div/parent::header/parent::body/parent::html")).getText());



	}

}

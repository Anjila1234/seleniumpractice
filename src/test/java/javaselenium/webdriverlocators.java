package javaselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverlocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//locators are the way to identify an HTML element on a web page. 
		
				//XPATH
				//CSSSelector
				//link text
				//Partial link text
				//id
				//class
				//name
				//tagname
				
				System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
				WebDriver driver = new ChromeDriver ();
				driver.get("https://www.facebook.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//Id
				driver.findElement(By.id("email")).sendKeys("anzelakatuwal@gmail.com");
				//name
				driver.findElement(By.name("pass")).sendKeys("Missumom@");
				driver.findElement(By.name("pass")).clear();
				//cssselector
				
//				driver.findElement(By.cssSelector("button[class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
//				//class
//				System.out.println(driver.findElement(By.className("_9ay7")).getText());
//				
////				
////				//link text
//				driver.findElement(By.linkText("Forgot password?")).click();
//			//	driver.quit();
			
				//Xpath
				
			driver.findElement(By.xpath("//div[@class='6ltg'][2]")).click();
				
				
				
				
	}

}

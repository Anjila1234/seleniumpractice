package javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class day1locator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("input[placeholder*=\"User\"]")).sendKeys("anzelakatuwal@gmail.com");
		driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys("Missumom@1");
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(5000);	
		//String password =getpassword(driver);
		//String Ws =driver.findElement(By.className("error")).getText();

//		if (Ws.equals("* Incorrect username or password")) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}

	//
		
//		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("p[class=\"error\"]")).getText());
	//sert.assertEquals(driver.findElement(By.className("error")).getText(),"* Incorrect username or password");
//		Assert.
	//ssert.assertEqual(driver.findElement(By.xpath("//div[@class=\"overlay-panel overlay-left\"]/h1")).getText(),"Rahul Shetty Academy");
	Assert.assertEquals(driver.findElement(By.className("error")).getText(),"* Incorrect username or password");
	

}
}

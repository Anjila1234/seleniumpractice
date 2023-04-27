package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver ();
		driver.get("https:/rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
	System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());	
//		int i = 1;
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
		for(int i=0; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());	
		}
		
//	driver.findElement(By.xpath("//span[@id=\"hrefDecAdt\"]"));
		Thread.sleep(5000);
//	driver.findElement(By.cssSelector("span[id=\"hrefIncInf\"]")).click();
	driver.findElement(By.cssSelector("input[id=btnclosepaxoption]")).click();
	
	
	}

}

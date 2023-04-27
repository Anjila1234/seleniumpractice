package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanamicdropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver ();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https:/rahulshettyacademy.com/dropdownsPractise/");
//driver.findElement(By.cssSelector("span[id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]")).click();Thread.sleep(5000);
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();


driver.findElement(By.xpath("//a[@value='IXG']")).click();
driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();

driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
//	driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"]//a[@value=\"IXG\"]")).click();
//


	//ctl00_mainContent_ddl_originStation1_CTXTaction

	

}
}

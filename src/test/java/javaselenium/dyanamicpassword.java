package javaselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dyanamicpassword {

	public static void main(String[] args) throws InterruptedException {
		String name = "rahul";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String password = getpassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input[placeholder*=\"User\"]")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.className("signInBtn")).submit();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText(),
				"You are successfully logged in.");
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " + name + ",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();

	}

	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordtext.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
	}
}

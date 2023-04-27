package javaselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowsactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
driver.navigate().back();
driver.navigate().forward();
	}

}

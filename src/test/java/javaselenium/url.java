package javaselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new 	ChromeDriver ();
		driver.get("https://rahulshettyacademy.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
		
		}
	public void getname() {
		System.out.println("ak");
	}
	}



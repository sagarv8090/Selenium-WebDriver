package day8;

import java.net.MalformedURLException;
//import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommandDemo {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demo.nopcommerce.com/");//open the url in chrome Browser
//		driver.navigate().to("https://demo.nopcommerce.com/");//open the url in chrome browser
		
//		URL myurl= new URL("https://demo.nopcommerce.com/");
		
//		driver.navigate().to(myurl); //doing samething as same get()method
		
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://sagar001-trials715.orangehrmlive.com/client/#/dashboard");
		
		driver.navigate().back();
		System.out.println("CurrentUrl1: "+driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("CurrentUrl1: "+driver.getCurrentUrl());
		driver.navigate().refresh();
		
		
	}

}

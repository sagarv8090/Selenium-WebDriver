package day6;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetMethods {


			public static void main(String[] args) {
				WebDriver driver= new ChromeDriver();
				
				//get(url)->Open the url on the browser
				driver.get("https://demo.nopcommerce.com/");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.manage().window().maximize();
				
				//getTitle()-> Returns the title of webpage
				System.out.println("Title of webpage: "+driver.getTitle());
				
				//getCurrentUrl()-> Get current url of current page
				System.out.println("Current URL: "+ driver.getCurrentUrl());
				
				//getPageSource()-> Get page source of webpage
//				System.out.println("Page Source: "+driver.getPageSource());
				
				//getWindowHandle()-> Returns ID of single window in browser(unique everytime)
				System.out.println("Unique Window ID of single window EveryTime : "+driver.getWindowHandle());
				
				//getWindowHandle()-> Returns ID of multiple window in browser(unique everytime)
				driver.findElement(By.linkText("Facebook")).click();
				Set<String>windowIDs=driver.getWindowHandles();
				System.out.println("Unique Window IDs of multiple window EveryTime : "+windowIDs);
			}

		


	
}

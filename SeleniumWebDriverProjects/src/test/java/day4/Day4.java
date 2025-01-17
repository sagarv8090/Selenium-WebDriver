package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute: -> //tagname[@attribute=”value”]
		//driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("sagar");
		
		//Xpath with multiple attribute: -> //tagname[@attribute1=’value1’][@attribute2=’value2’]
		//driver.findElement(By.xpath("//input[@placeholder='Search store'][@id='small-searchterms']")).sendKeys("sagar vishwakarma");
		
		//Xpath with ‘and’ operator: ->tagname[@name=’search’ and @placeholder=’search here’]
		//driver.findElement(By.xpath("//input[@placeholder='Search store' and @id='small-searchterms']")).sendKeys("sagar vishwakarma");
		
		//Xpath with ‘or operator: ->tagname[@name=’search’ or @placeholder=’search here’]
		//driver.findElement(By.xpath("//input[@placeholder='Search store' or @id='small-searcrms']")).sendKeys("sagar vishwakarma");
		
		//Xpath with text(): -> inner text
		//Boolean isDisplay=driver.findElement(By.xpath("//h1[text()='Computers']")).isDisplayed();
		//Boolean isDisplay=driver.findElement(By.xpath("//a[text()='Computers']")).isDisplayed();
		//System.out.println(isDisplay);
		
		//Xpath with contains(): -> only substring required
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')")).sendKeys("sagar");
		
		//Xpath with start-with(): -> only starting substring required
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')")).sendKeys("sagar");
		
		
		

	}

}

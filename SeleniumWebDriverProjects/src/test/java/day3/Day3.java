package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag and id combination (tag#id)->tag is optional here (input in this case)
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("sagar");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("sagar");
		
		//tag and class combination(tag.classname)->tag is optional here
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");//can be used for selection multiple webelements
		
		// Tag with attribute (tag[attribute="value"])
		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("T-shirts");
		driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("T-shirts");
		
		//tag class attribute(tag.classname[attribute='x'])->tag can be removed
//		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Sagar Vishwakarma");
//		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Sagar Vishwakarma");
		

		
	}

}

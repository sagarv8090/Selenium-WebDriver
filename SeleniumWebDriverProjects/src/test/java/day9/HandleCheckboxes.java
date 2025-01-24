package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1> Selecting specific checkboxes/radio btn
		driver.findElement(By.xpath("//input[@id='male']")).click();
		
		//2> Selecting whole checkboxes using indexing method
		List<WebElement>checkBoxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//		for(int i=0;i<checkBoxes.size();i++) {
//			checkBoxes.get(i).click();
//		}
		//using enhanced for loop
		for(WebElement checkbox:checkBoxes) {
			checkbox.click();
		}
		Thread.sleep(5000);
		//3> Unselect checkBoxes if it is selected
		for(WebElement checkbox:checkBoxes) {
			if(checkbox.isSelected()) {
				checkbox.click();
			}
		}		
	}
}
				

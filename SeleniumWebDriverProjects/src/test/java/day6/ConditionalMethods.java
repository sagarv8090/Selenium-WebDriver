package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed(): Check display status of element
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo: "+ logo.isDisplayed());
		
		//isEnabled(): Check enable/disable status of element/operational element
		WebElement firstName=driver.findElement(By.id("FirstName"));
		System.out.println("FirstName is enable or not: "+firstName.isEnabled());
		
		
		System.out.println("Before selecting, status of radio button for gender (male, female)");
		//isSelected(): Check the element is selected or not
		WebElement male_radio_button=driver.findElement(By.id("gender-male"));
		System.out.println("Male radio is selected or not: "+male_radio_button.isSelected());
		
		WebElement female_radio_button=driver.findElement(By.id("gender-female"));
		System.out.println("Female radio is selected or not: "+female_radio_button.isSelected());
		
		System.out.println("After selecting male radio button, status of radio button for gender (male, female)");
		male_radio_button.click();
		System.out.println("Male radio is selected or not: "+male_radio_button.isSelected());
		System.out.println("Female raido is selected or not: "+female_radio_button.isSelected());
		
		
		//checking newsletter checkbox
		WebElement news_letter_checkbox = driver.findElement(By.xpath("//input[@id='Newsletter']"));
		System.out.println("Newsletter CheckBox is selected or not: "+news_letter_checkbox.isSelected());
	}

}

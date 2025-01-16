package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Manual testing : Will be converted to automated testing.
 * 1) Launch browser (chrome)
 * 2) Open Url https://democart.com/
 * 3) Validate titel it should be 'Your cart'
 * 4) Close browser
 * 
*/
public class Day1 {

	public static void main(String[] args) {
		//1) Launch chrome browser
		//ChromeDriver driver =new ChromeDriver();
		WebDriver driver=new ChromeDriver();//prefered practice
		
		//2) Open Url (https://democart.com/)
		driver.get("https://demo.opencart.com/");
		
		//3) Validate titel it should be "Your Store"
		String actual_title=driver.getTitle();
		
		//if(actual_title=="Your Store"){fails because actual_title is an object}
		if(actual_title.equals("Your Store")) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
			System.out.println(actual_title);
		}
		driver.close();
		//driver.quit();
		
	}

}

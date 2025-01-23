package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//call only once it check in between every script (if not required to wait it take 0 sec else take 5 sec)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://leetcode.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.id("id_login")).sendKeys("sagar");
	}

}

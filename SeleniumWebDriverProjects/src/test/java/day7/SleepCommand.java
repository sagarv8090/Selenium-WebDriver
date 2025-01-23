package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://leetcode.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();
		
		//if we will not thread.sleep() method here then we are getting this error: errors#no-such-element-exception
		Thread.sleep(5000); //not getting error
		driver.findElement(By.id("id_login")).sendKeys("sagar");
		

	}

}

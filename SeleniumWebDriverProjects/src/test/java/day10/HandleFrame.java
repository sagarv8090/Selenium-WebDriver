package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");;
		driver.manage().window().maximize();
		
		//frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);//passed frame as a webElement->switch to frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome to frame1");
		driver.switchTo().defaultContent();//driver move to original page instead of staying in frame1
		
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome to frame2");
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcome to frame3");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[contains(text(), 'I am a human')]")).click();
		driver.switchTo().defaultContent();

		
		

	}

}

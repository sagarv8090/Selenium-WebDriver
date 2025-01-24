package day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		
		//handling normal alert with ok button (alert box)
		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		Alert myAlert1=driver.switchTo().alert();
		System.out.println("myAlert text: "+myAlert1.getText());
		Thread.sleep(5000);
		myAlert1.accept();
		
		//handling confirmation alert with ok and cancel btn (confirmation box)
		driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
		Thread.sleep(5000);
//	    driver.switchTo().alert().accept();//close alert using OK btn
	    driver.switchTo().alert().dismiss();//close alert using cancel btn
	    
	    //handling prompt alert with ok, cancel and input field (prompt box)
	    driver.findElement(By.xpath("//input[@id='promptexample']")).click();
	    Alert myAlert2=driver.switchTo().alert();
		System.out.println("myAlert text: "+myAlert2.getText());
		Thread.sleep(5000);
		myAlert2.sendKeys("sagar");
		Thread.sleep(2000);
		myAlert1.accept();
		
		

	}

}

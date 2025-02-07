package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait declaration
		
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		
		//handling normal alert with ok button (alert box)
		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		Thread.sleep(5000);
		Alert myAlert=myWait.until(ExpectedConditions.alertIsPresent());//capture alert
		System.out.println("myAlert text: "+myAlert.getText());
		myAlert.accept();
		

	}

}

package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));//declaration of explicit wait
		
		driver.get("https://leetcode.com/");
		driver.manage().window().maximize();
		
		WebElement signIn=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in")));
		signIn.click();

		WebElement loginId=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_login")));
		loginId.sendKeys("sagar_vishwakarma_123");
		
		WebElement Password=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_password")));
		Password.sendKeys("svdrs8090");
		
		WebElement verifyCheckbox= myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
		verifyCheckbox.click();
		
		WebElement signInBtn=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin_btn")));
		signInBtn.click();
	}

}

package day7;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWatiDemo {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();

Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(10))
.pollingEvery(Duration.ofSeconds(2))
.ignoring(NoSuchElementException.class);//declaration of Fluent wait


driver.get("https://leetcode.com/");
driver.manage().window().maximize();

WebElement signInBtn = myWait.until(new Function<WebDriver, WebElement>() {
    public WebElement apply(WebDriver driver) {
      return driver.findElement(By.linkText("Sign in"));
    }
  });
signInBtn.click();

		

	}

}

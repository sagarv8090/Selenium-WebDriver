package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

    public static void main(String[] args) {
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the website and maximize the browser window
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        // Examples of using various XPath expressions:

        // 1. XPath with a single attribute:
        // Syntax: //tagname[@attribute='value']
        // driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("sagar");

        // 2. XPath with multiple attributes:
        // Syntax: //tagname[@attribute1='value1'][@attribute2='value2']
        // driver.findElement(By.xpath("//input[@placeholder='Search store'][@id='small-searchterms']")).sendKeys("sagar vishwakarma");

        // 3. XPath with 'and' operator:
        // Syntax: //tagname[@attribute1='value1' and @attribute2='value2']
        // driver.findElement(By.xpath("//input[@placeholder='Search store' and @id='small-searchterms']")).sendKeys("sagar vishwakarma");

        // 4. XPath with 'or' operator:
        // Syntax: //tagname[@attribute1='value1' or @attribute2='value2']
        // driver.findElement(By.xpath("//input[@placeholder='Search store' or @id='small-searchterms']")).sendKeys("sagar vishwakarma");

        // 5. XPath with text():
        // Syntax: //tagname[text()='inner text']
        // Boolean isDisplay = driver.findElement(By.xpath("//h1[text()='Computers']")).isDisplayed();
        // System.out.println(isDisplay);

        // Alternative example with a link:
        // Boolean isDisplay = driver.findElement(By.xpath("//a[text()='Computers']")).isDisplayed();
        // System.out.println(isDisplay);

        // 6. XPath with contains():
        // Syntax: //tagname[contains(@attribute, 'substring')]
        // driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).sendKeys("sagar");

        // 7. XPath with starts-with():
        // Syntax: //tagname[starts-with(@attribute, 'starting substring')]
        //driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("sagar");
        
        // Close the driver (if needed)
        // driver.quit();
    }
}

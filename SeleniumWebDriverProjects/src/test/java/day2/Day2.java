package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

    public static void main(String[] args) {
        // Initialize the ChromeDriver to open Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the specified URL (in this case, Zomato website)
        driver.get("https://zomato.com/");  // This URL can be changed to any other website
        driver.manage().window().maximize();  // Maximize the browser window for better visibility
        
        // ----------------- Example 1: Using 'name' attribute -----------------
        // This can be used to locate elements with the 'name' attribute (e.g., search box)
        // driver.findElement(By.name("search")).sendKeys("Sagar");  // Sends "Sagar" to the search box
        
        // ----------------- Example 2: Using 'id' attribute -----------------
        // This can be used to locate elements with the 'id' attribute (e.g., logo on the page)
        // Boolean isLogoDisplay = driver.findElement(By.id("logo")).isDisplayed();  // Checks if logo is displayed
        // System.out.println(isLogoDisplay);  // Prints whether the logo is displayed (true/false)
        
        // ----------------- Example 3: Using 'linkText' and 'partialLinkText' -----------------
        // 'linkText' is used for full link text matching
        // driver.findElement(By.linkText("Tablets")).click();  // Clicks on the full link text "Tablets"
        
        // 'partialLinkText' is used for partial link text matching
        // driver.findElement(By.linkText("Table")).click();  // Clicks on the partial link text "Table" (not preferred)
        
        // ----------------- Example 4: Using 'className' attribute -----------------
        // 'className' is used to locate elements by their 'class' attribute
        // In this case, we're finding all header links on the page
        // List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        // System.out.println("Total number of header links: " + headerLinks.size());  // Prints the number of header links
        
        // ----------------- Example 5: Using 'tagName' to find 'a' (anchor) tags -----------------
        // This will find all anchor tags (<a>) on the page (i.e., links)
        // List<WebElement> links = driver.findElements(By.tagName("a"));
        // System.out.println("Total number of links: " + links.size());  // Prints the total number of links on the page
        
        // ----------------- Example 6: Using 'tagName' to find 'img' tags -----------------
        // This will find all image tags (<img>) on the page
        // List<WebElement> images = driver.findElements(By.tagName("img"));
        // System.out.println("Total number of images: " + images.size());  // Prints the total number of images on the page
        
        // Closing the browser after all operations are done
        driver.quit();  // Always good practice to quit the driver after test completion to free up resources
    }
}

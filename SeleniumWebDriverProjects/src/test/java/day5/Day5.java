package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

    public static void main(String[] args) {
        // Set up WebDriver and navigate to the webpage
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        //self- select current node
        String current = driver.findElement(By.xpath("//a[contains(text(),'Bharat Petroleum')]/self::a")).getText();
        System.out.println("Self: " + current);//Bharat Petroleum
        
        //parent-select the parent node of current node
        String parent1 = driver.findElement(By.xpath("//a[contains(text(),'Bharat Petroleum')]/parent::td")).getText();
        System.out.println("Parent: " + parent1);//Bharat Petroleum
        
        //child- select all children of the current node(one or more)
        List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/td"));
        //List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/*"));
        System.out.println("Number of child elements: " + childs.size());
        
        //Ancestor- Select all ancestor(parent, grandparent etc)
        String allAncestors = driver.findElement(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr")).getText();
        System.out.println("Ancestor:"+allAncestors);
        
        //Descendant- Selects all descendants (child, grandchildren) of current node
        List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/descendant::*"));
        System.out.println("Number of Descendants: " + descendants.size());
        
        //Following - Selects everything in the document after closing tag of current node
        List<WebElement> followingnodes = driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/following::*"));
        System.out.println("Number of Following nodes: " + followingnodes.size());
        
        //Preceding - Selects all node that appear before the current node in document
        List<WebElement> precedingnodes = driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/preceding::*"));
//        List<WebElement> precedingnodes = driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/preceding::tr"));
        System.out.println("Number of Preceding nodes: " + precedingnodes.size());
        
     // Select all sibling rows after the current node (following siblings of <tr>)
        List<WebElement> siblingsAfterCurrentNode = driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/following-sibling::*"));
//        List<WebElement> siblingsAfterCurrentNode = driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/following-sibling::tr"));
        System.out.println("Number of siblings after the current node: " + siblingsAfterCurrentNode.size());

        // Select all sibling rows before the current node (preceding siblings of <tr>)
        List<WebElement> siblingsBeforeCurrentNode = driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/preceding-sibling::*"));
//        List<WebElement> siblingsBeforeCurrentNode = driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println("Number of siblings before the current node: " + siblingsBeforeCurrentNode.size());

       

        // Close the browser
//        driver.quit();
    }
}

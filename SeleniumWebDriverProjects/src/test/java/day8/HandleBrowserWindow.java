package day8;

import java.time.Duration;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//Approach 1
		Set<String>windowIDs=driver.getWindowHandles();
//		List<String>windowList=new ArrayList(windowIDs);
//		String parentID=windowList.get(0);
//		String childID=windowList.get(1);
		
		//by default driver is located to parent window, however in chrome it shows on child window
		
		//switch to child window
//		driver.switchTo().window(childID);
//		System.out.println("Title of child page: "+driver.getTitle());
		
		//switch to parent window
//		driver.switchTo().window(parentID);
//		System.out.println("Title of parent page: "+driver.getTitle());
		
		//Approach 2
		for(String windowId:windowIDs) {
			String title=driver.switchTo().window(windowId).getTitle();
			if(title.equals("OrangeHRM")) {
				System.out.println("Perform some action on OrangeHRM page");
			}
		}
		

	}

}

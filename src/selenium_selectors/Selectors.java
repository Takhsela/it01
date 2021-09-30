package selenium_selectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectors {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		 
		
        driver.get("http://www.amazon.in/");	
        driver.manage().window().maximize();
        Thread.sleep(4000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone12");
        Thread.sleep(4000);
      driver.findElement(By.id("nav-search-submit-button")).click();
      driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")) .click();
      

      Set<String> windowhandles =driver.getWindowHandles();
      System.out.println(windowhandles);
      // Now iterate using Iterator
      Iterator<String> iterator =windowhandles.iterator();
      String parentwindow = iterator.next();
      String childwindow = iterator.next();
      driver.switchTo().window(childwindow);
      
      WebElement radio = driver.findElement(By.id("maxBuyBackDiscountSection"));
      //WebElement radio1 = driver.findElement(By.className("a-icon a-accordion-radio a-icon-radio-active"));
      radio.click();
      System.out.println(radio.isSelected());
      
      
     
      
      //driver.findElement(By.className("hm-icon-label")).click();
      
     // driver.findElement(By.xpath("(//a[@data-menu-id=\"3\"])"));
 //  driver.findElement(By.xpath("(//input[@name='submit.add-to-cart'])")).click();
   
 // driver.findElement(By.xpath("(//span[@class=\"a-button a-button-primary attach-primary-button attach-button-large\"])")).click();
  
  //driver.findElement(By.id("attach-close_sideSheet-link")).click();
      
      // driver.findElement(By.xpath("//div[@id='draggable']"));
    //  driver.findElement(By.xpath("//c)
       // driver.findElement(By.className("nav-search-submit-text nav-sprite nav-progressive-attribute")).click();
        //Thread.sleep(4000);
      //  System.out.println("it is clicked");	
        
	}
}

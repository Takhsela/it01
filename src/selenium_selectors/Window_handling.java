package selenium_selectors;

import java.util.Set;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");	 
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://demo.guru99.com/popup.php";
        driver.get(url_name);
        driver.manage().window().maximize();
        WebElement clk_here = driver.findElement(By.xpath("//a[@target=\"_blank\"]"));
        clk_here.click();
        String MainWindow=driver.getWindowHandle();	
     // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();
      	
        Iterator<String> iterator =s1.iterator();
		
        while(iterator.hasNext())			
        {		
            String ChildWindow=iterator.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("takhsela86@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                            Thread.sleep(3000);     
			// Closing the Child Window.
                        driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);		
	}

}

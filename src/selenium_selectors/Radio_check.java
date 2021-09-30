package selenium_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://demo.guru99.com/test/radio.html";
        driver.get(url_name);
        driver.manage().window().maximize();
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        radio1.click();
        Thread.sleep(4000);
        WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
        radio3.click();
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        
        if(radio3.isSelected())
        	
        {
        	
            radio2.click();
        }
        
        if(radio2.isSelected())
        {
        	 WebElement chk1 = driver.findElement(By.id("vfb-6-0"));
        	 chk1.click();
        	 if(chk1.isSelected())
        	 {
        		 System.out.println("check list 1 is selected");
        		 
        	 }
        }
        }
	}



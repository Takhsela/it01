package selenium_selectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_alert_popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://demo.guru99.com/test/delete_customer.php";
        driver.get(url_name);
        driver.manage().window().maximize();
        WebElement txt_box =driver.findElement(By.name("cusid"));
        Actions builder = new Actions(driver);
        org.openqa.selenium.interactions.Action fill_username =builder.moveToElement(txt_box).click().sendKeys(txt_box, "EAD2022").doubleClick(txt_box).build();
        fill_username.perform();
        WebElement press_submit =driver.findElement(By.xpath("//input[@name=\"submit\"]"));
        press_submit.click();
        //switching to alert
        Alert alert = driver.switchTo().alert();
     // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
	
        Alert alert1 = driver.switchTo().alert();
        String alertMessage1= driver.switchTo().alert().getText();
        System.out.println(alertMessage1);
        alert1.accept();	
        
        //handling popups
	}

}

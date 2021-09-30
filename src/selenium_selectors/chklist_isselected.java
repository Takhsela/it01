package selenium_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chklist_isselected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://demo.guru99.com/test/facebook.html";
        driver.get(url_name);
        driver.manage().window().maximize();
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<=1; i++) {											
            chkFBPersist.click ();
            Thread.sleep(4000);
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		

	}

}

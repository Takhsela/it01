package selenium_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_selection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://demo.guru99.com/test/newtours/register.php";
        driver.get(url_name);
        driver.manage().window().maximize();
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("BAHAMAS");
        Thread.sleep(4000);
        drpCountry.selectByIndex(2);
      
	}

}

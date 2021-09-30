package selenium_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_compare {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Checking for Changes");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	 
		String url_name = "https://www.facebook.com/login/identify?ctx=recover";
        driver.get(url_name);
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class=\"bp9cbjyn j83agx80 byvelhso pedkr2u6 ijkhr0an pnx7fd3z sgqwj88q k4urcfbm f4muv6rs\"]")).click();				

		//verify that we are now back on Facebook's homepage		
		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
        System.out.println("We are back at Facebook's homepage");					
    } else {			
        System.out.println("We are NOT in Facebook's homepage");					
    }		
	}
	}



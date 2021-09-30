package selenium_selectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	 
		 driver.manage().window().maximize();
		 String base_url="http://demo.guru99.com/selenium/deprecated.html";
		 driver.get(base_url);
	}

}

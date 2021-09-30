package selenium_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_tag_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://www.facebook.com";
		String tag_name="";
		driver.get(url_name);
		
tag_name = driver.findElement(By.id("email")).getTagName();
System.out.println(tag_name);
driver.close();
System.exit(0);

		

	}

}

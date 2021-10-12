package selenium_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_for_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");	 
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://demo.guru99.com/test/write-xpath-table.html";
        driver.get(url_name);
        driver.manage().window().maximize();
        String innerText = driver.findElement(By.xpath("(//td[\"fourth cell\"])[4]")).getText(); 		
        System.out.println(innerText); 
        driver.quit();
	}

}

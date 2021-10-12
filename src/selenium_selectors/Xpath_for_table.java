package selenium_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_for_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");	 
		WebDriver driver = new ChromeDriver();	 
	//	String url_name = "http://demo.guru99.com/test/write-xpath-table.html";
   //     driver.get(url_name);
     //   driver.manage().window().maximize();
     //   String innerText = driver.findElement(By.xpath("(//td[\"fourth cell\"])[4]")).getText(); 		
      //  System.out.println(innerText); 
   //     driver.quit();
        String url1_name="http://demo.guru99.com/test/newtours/";
        driver.get(url1_name);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement move_to=driver.findElement(By.xpath("//img[@src=\"images/featured_destination.gif\"]"));
        js.executeScript("arguments[0].scrollIntoView();",  move_to);
        String print_text = driver.findElement(By.xpath("(//font[@face=\"Arial, Helvetica, sans-serif\"])[6]")).getText();
        System.out.println(print_text);
	}

}

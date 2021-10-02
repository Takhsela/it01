package selenium_selectors;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://demo.guru99.com/test/newtours/";
        driver.get(url_name);
        driver.manage().window().maximize();
        WebElement link_home = driver.findElement(By.xpath("//tr[@class='mouseOut'][1]")); 
        WebElement td_link = driver.findElement(By.xpath("(//tr[@valign=\"top\"])[1]"));
        Actions builder = new Actions(driver);
        org.openqa.selenium.interactions.Action mouseOverHome = builder.moveToElement(link_home).build();
        
        String bgColor = td_link.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);        
        mouseOverHome.perform();        
        bgColor =td_link.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        driver.close();
        
	}

}

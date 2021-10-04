package selenium_selectors;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Input_keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://demo.guru99.com/test/newtours/";
        driver.get(url_name);
        driver.manage().window().maximize();
        WebElement ur_name=driver.findElement(By.xpath("//input[@name=\"userName\"]"));
        Actions builder = new Actions(driver);
        org.openqa.selenium.interactions.Action fill_username =builder.moveToElement(ur_name).click().sendKeys(ur_name, "takhsela86@gmail.com").doubleClick(ur_name).build();
        fill_username.perform();
        WebElement pass_word=driver.findElement(By.xpath("//input[@type=\"password\"]"));
        org.openqa.selenium.interactions.Action fill_password = builder.moveToElement(pass_word).click().sendKeys(pass_word, "kirubhakaran").doubleClick().build();
        fill_password.perform();
	}

}

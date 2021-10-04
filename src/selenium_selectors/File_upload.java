package selenium_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://demo.guru99.com/test/upload/";
        driver.get(url_name);
        driver.manage().window().maximize();
        WebElement ch_file_click =driver.findElement(By.xpath("//input[@name=\"uploadfile_0\"]"));
        ch_file_click.sendKeys("C:\\Users\\Takhsela\\Desktop");
        WebElement chk_box =driver.findElement(By.className("field_check"));
        chk_box.click();
        WebElement clk_submit = driver.findElement(By.xpath("//button[@name=\"send\"]"));
        clk_submit.click();
        
	
	}
	

}

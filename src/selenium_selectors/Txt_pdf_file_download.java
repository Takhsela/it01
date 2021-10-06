package selenium_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Txt_pdf_file_download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String url_name = "http://demo.automationtesting.in/FileDownload.html";
        driver.get(url_name);
        driver.manage().window().maximize();
        WebElement txt_box_write=driver.findElement(By.xpath("//textarea[@id=\"textbox\"]"));
        js.executeScript("arguments[0].scrollIntoView();", txt_box_write);
        Actions builder = new Actions(driver);
        org.openqa.selenium.interactions.Action fill_username =builder.moveToElement(txt_box_write).click().sendKeys(txt_box_write, "This is a text box ").build();
        fill_username.perform();
        WebElement Gen_click =driver.findElement(By.xpath("//button[@id=\"createTxt\"]"));
        Gen_click.click();
        WebElement clk_download_txt = driver.findElement(By.xpath("//a[@id=\"link-to-download\"]"));
        clk_download_txt.click();
        WebElement pdf_write = driver.findElement(By.xpath("//textarea[@id=\"pdfbox\"]"));
        js.executeScript("arguments[0].scrollIntoView();", pdf_write);
        Actions builder1 = new Actions(driver);
        org.openqa.selenium.interactions.Action fill_username1 =builder1.moveToElement(pdf_write).click().sendKeys(pdf_write, "This is a pdf box ").build();
        fill_username1.perform();
	}

}

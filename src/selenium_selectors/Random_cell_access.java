package selenium_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random_cell_access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");	 
		wd = new ChromeDriver();	 
		String url1_name="http://demo.guru99.com/test/web-table-element.php";
        wd.get(url1_name);
        wd.manage().window().maximize();
        WebElement baseTable = wd.findElement(By.tagName("table"));
        //to locate 3rd row
        WebElement third_row = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
       String third_row_text = third_row.getText();
        System.out.println("The third row in the table is"+third_row_text);
        
        //to loacte 3rd row ,2nd col cell
        
        WebElement cell_needed = third_row.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
       String cell_needed_value=cell_needed.getText();
       System.out.println("The cell value is" +cell_needed_value);
        
        
	}

}

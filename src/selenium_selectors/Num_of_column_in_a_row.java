package selenium_selectors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Num_of_column_in_a_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd;
       	System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 wd= new ChromeDriver();
		 wd.get("http://demo.guru99.com/test/table.html"); 
		 wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement locate_table=wd.findElement(By.xpath("/html/body/table"));
		 List<WebElement> no_of_rows=locate_table.findElements(By.xpath("/html/body/table/tbody/tr"));
		 System.out.println("The size of rows="+no_of_rows.size());
		 for (int row = 0; row < no_of_rows.size(); row++) {
			 //To locate columns(cells) of that specific row.
	    	    List < WebElement > columns_row = no_of_rows.get(row).findElements(By.tagName("td"));
	    	    System.out.println("Number of cells In Row " + row + " are " + columns_row.size());
	    	  //Loop will execute till the last cell of that specific row.
	    	    for (int column = 0; column < columns_row.size(); column++) {
	    	        // To retrieve text from that specific cell.
	    	        String celtext = columns_row.get(column).getText();
	    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
	    	    }
	    	    System.out.println("-------------------------------------------------- ");
			 
			 
		 }
	}

}

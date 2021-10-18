package selenium_selectors;
import java.util.List;
import java.text.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_colums_rows_table {

	public static void main(String[] args)throws ParseException {
		// TODO Auto-generated method stub
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");	 
		wd = new ChromeDriver();	 
		String url1_name="http://demo.guru99.com/test/web-table-element.php";
        wd.get(url1_name);
        wd.manage().window().maximize();
       List col=wd.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("no: of columns"+ col.size());
        List row=wd.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td"));
        System.out.println("no: of rows"+ row.size());
	}

}

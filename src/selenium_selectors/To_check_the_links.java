package selenium_selectors;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;	
public class To_check_the_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	 
		String url_name = "http://demo.guru99.com/test/newtours/";
        driver.get(url_name);
        driver.manage().window().maximize();
        
        String underConsTitle = "Under Construction: Mercury Tours";					
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
	
		 List<WebElement> linkElements = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		
		System.out.println("the size of the col is ="+linkElements.size());
		 String[] linktexts=new String[linkElements.size()];
		 int i = 0;	
		//extract the link texts of each link element		
			for (WebElement e : linkElements) {						
			//	System.out.println("web element text is "+e.getText());
			linktexts[i] = e.getText();	
			System.out.println("web element text is "+linktexts[i]);
			i++;			
     }		
		
			//test each link		
			for (String t : linktexts) {
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals(underConsTitle)) {							
             System.out.println("\"" + t + "\""								
                     + " is under construction.");			
         } else {			
             System.out.println("\"" + t + "\""								
                     + " is working.");			
         }		
				driver.navigate().back();
			
     }		
			driver.quit();					
		
		 
	}
	
	catch(Exception e) {
		//do nothing
	}
	}
}

package SeleniumExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2177600\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	
		driver.get("https://www.amazon.in/");	
		driver.manage().window().maximize();  
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 try {
	            FileUtils.copyFile(screenshot, new File("\\Users\\2177600\\eclipse-workspace\\Amazon_Err.png"));
	            } 
	        catch (IOException e) 
	        {
	            System.out.println(e.getMessage());
	        }
		driver.quit();
		
		
	}

}

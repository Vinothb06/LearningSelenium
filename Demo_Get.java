package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// finding a browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2177600\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		//launching chrome (driver is a object of Webdriver Interface) 
		WebDriver driver = new ChromeDriver(); 
		//fetch a website
		driver.get("https://www.google.co.in/");
		//Get Title of the current page
		String title = driver.getTitle();
		System.out.println(title);
		//Get page Source
		String page = driver.getPageSource();
		System.out.println(page);
		//Get Current URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// to close the current webpage - close() to close the entire browser - quit()
		driver.close();
		
	}   

}

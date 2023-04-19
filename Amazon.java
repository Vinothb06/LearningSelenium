package SeleniumExamples;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2177600\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	
		driver.get("https://www.amazon.in/");	
		driver.manage().window().maximize();
		
		//Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath("//a[@href='https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&']")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("abcd");
		driver.findElement(By.id("ap_phone_number")).sendKeys("12yt4");
		driver.findElement(By.id("ap_email")).sendKeys("abc@123");
		driver.findElement(By.id("ap_password")).sendKeys("abc@123");
		driver.findElement(By.id("continue")).click();
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        	     
        try {
            FileUtils.copyFile(screenshot, new File("D:\\vinoth.b06\\Selenium\\WorkSpace\\Amazon_Err.png"));
            } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
		
        driver.findElement(By.id("ap_customer_name")).clear();
		driver.findElement(By.id("ap_phone_number")).clear();
		driver.findElement(By.id("ap_email")).clear();
		driver.findElement(By.id("ap_password")).clear();
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[7]/div/span[1]/img")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		       
		Select drop = new Select (driver.findElement(By.xpath("//*[@id=\"sorting_dropdown0\"]")));
		drop.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
 
		driver.findElement(By.xpath("//a[@href=\"https://www.amazon.in/Natural-Vibes-Ayurvedic-Brightening-complexion/dp/B084QJ7X87?ref=dlx_deals_gd_dcl_img_0_47d9f13d_dt_sl15_b5\"]")).click();
				
		File screenshotone = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     
        try {
            FileUtils.copyFile(screenshotone, new File("D:\\vinoth.b06\\Selenium\\WorkSpace\\Product.png"));
            } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
		
		driver.quit();
	}

}

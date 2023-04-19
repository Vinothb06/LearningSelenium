package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TxtBoxEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		WebElement append = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));	
		append.sendKeys("added");
		WebElement retrive = driver.findElement(By.name("username"));
		String value=   retrive.getAttribute("value");
		System.out.println(value);
		WebElement clear = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clear.clear();
		WebElement disable = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean box = disable.isEnabled();
		System.out.println(box);

		driver.close();

	}

}

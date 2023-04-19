package SeleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		//using Index, visibleText, Value
		WebElement DropD1 = driver.findElement(By.id("dropdown1"));
		Select name = new Select(DropD1);
		name.selectByIndex(2);
		name.selectByValue("4");
		name.selectByVisibleText("Selenium");

		//number of DropDown options 
		List<WebElement> ListofOptions = name.getOptions();
		int num = ListofOptions.size();
		System.out.println("no of ele " + num);

		//using sendkeys
		DropD1.sendKeys("Selenium");

		//Multiselect
		WebElement Multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiselectbox = new Select(Multiselect);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(4);
	}

}

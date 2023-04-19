package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a")).click();

		//position
		WebElement position= driver.findElement(By.id("position"));
		Point coordinates = position.getLocation();
		int	xcoordinate =coordinates.getX();
		int ycoordinate = coordinates.getY();

		  
		System.out.println("value of X" +xcoordinate );
		System.out.println("value of Y"+ycoordinate );

		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();	

		System.out.println("height is: " +height+ " Width is: " +width);

		//click
		WebElement click= driver.findElement(By.id("home"));
		click.click();

		driver.close();
	}

}

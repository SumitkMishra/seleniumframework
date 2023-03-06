package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="F:\\chromedriver\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"DEPARTURE\"]")).click();
		
		String month="February 2023";
		String date="24";

		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='24']")).click();
	}

}

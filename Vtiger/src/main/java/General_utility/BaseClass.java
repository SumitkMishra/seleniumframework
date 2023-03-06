package General_utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import POM_Repo.Home_page;

public class BaseClass {
 public WebDriver driver; 
 public static WebDriver sdriver;
	@BeforeSuite
	public void bs() {
		System.out.println("database connection");
	}
	@BeforeTest
	public void bT() {
		System.out.println("type of execution=Parallel execution");
	}
	@BeforeClass
	public void bc() {
		String key="webdriver.chrome.driver";
		String value="F:\\chromedriver\\chromedriver.exe";
		System.setProperty(key, value);
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("launching the browser");
		sdriver=driver;
	}
	@BeforeMethod()
	public void BM() throws Throwable {
		Property_utility plib=new Property_utility();
		String url = plib.getkeyvalue("url");
		String usn = plib.getkeyvalue("username");
		String pwd = plib.getkeyvalue("password");
		
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(usn);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		System.out.println("login Application");
	}
	@AfterMethod
	public void Am() {
		Home_page home=new Home_page(driver);
		home.logout(driver);
		System.out.println("logout Application");
	}
	@AfterClass
	public void ac() {
		System.out.println("closing the browser");
	}
	@AfterTest
	public void AT() {
		System.out.println("parallel execution done");
	}
	@AfterSuite
	public void AS() {
		System.out.println("database Closed");
	}
}

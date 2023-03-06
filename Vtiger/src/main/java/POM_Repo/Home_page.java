package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import General_utility.webdriver_Utility;

public class Home_page {
 public Home_page(WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }
 @FindBy(linkText="Organizations")
 private WebElement orgnbtn;
 
 @FindBy(linkText="Products")
 private WebElement prdbtn;
 

@FindBy(linkText="More")
 private WebElement Morelink;
  
 @FindBy(linkText="Campaigns")
 private WebElement campaignlink;
 
 @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
 private WebElement signoutimg;
 
 @FindBy(xpath="//a[text()='Sign Out']")
 private WebElement signoutlink;
 
 public WebElement getOrgnbtn() {
	return orgnbtn;
}

public WebElement getPrdbtn() {
	return prdbtn;
}

public WebElement getMorelink() {
	return Morelink;
}

public WebElement getCampaignlink() {
	return campaignlink;
}

public WebElement getSignoutimg() {
	return signoutimg;
}

public WebElement getSignoutlink() {
	return signoutlink;
}
//business logic for organisation
 public void clickorganisation() {
	 orgnbtn.click(); 
 }
 //business logic for signout
 public void logout(WebDriver driver) {
	 Actions a=new Actions(driver);
	 a.moveToElement(signoutimg).perform();
	 signoutlink.click();
 }
}

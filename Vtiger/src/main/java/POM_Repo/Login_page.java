package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
  public Login_page(WebDriver driver) {
	  PageFactory.initElements(driver,this);
  }
  //decleration
  @FindBy(name="user_name")
	  private WebElement usertextfield;
  
  @FindBy(name="user_password")
  private WebElement pwdtextfield;
  
  @FindBy(id="submitButton")
  private WebElement submitbtn;
  
//Getters method
public WebElement getUsertextfield() {
	return usertextfield;
}

public WebElement getPwdtextfield() {
	return pwdtextfield;
}

public WebElement getSubmitbtn() {
	return submitbtn;
}
public void logintoapp(String usename,String password) {
	usertextfield.sendKeys(password);
	pwdtextfield.sendKeys(password);
	submitbtn.click();
}
	  
  
}

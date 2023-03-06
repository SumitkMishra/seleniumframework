package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationCreatepage {
	public OrganizationCreatepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement plussign;
	
	@FindBy(name="accountname")
	private WebElement orgname;
	
	@FindBy(name="button")
	private WebElement savebtn;

	public WebElement getPlussign() {
		return plussign;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	 public void clickonorganization() {
		 plussign.click();
	 }
	 public void organizationname(String name) {
		 orgname.sendKeys(name);
	 }
	 public void save() {
		 savebtn.click();
	 }

}

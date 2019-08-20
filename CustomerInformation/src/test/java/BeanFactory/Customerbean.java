package BeanFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Customerbean {
	
	@FindBy(id="txtEmail")
	@CacheLookup
	WebElement emailId;
	
	@FindBy(name="txtFName")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(name="txtLName")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(name="txtMNo")
	@CacheLookup
	WebElement mobileNo;
	
	@FindBy(id="txtAResidenceAdd")
	@CacheLookup
	WebElement address;
	
	@FindBy(id="pic")
	@CacheLookup
	WebElement photo;
	
	@FindBy(how=How.ID, using="btnSubmit")
	@CacheLookup
	WebElement updateButton;

	public Customerbean(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId.sendKeys(emailId);;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo.sendKeys(mobileNo);
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public WebElement getPhoto() {
		return photo;
	}

	public void setPhoto(WebElement photo) {
		this.photo = photo;
	}

	public WebElement getUpdateButton() {
		return updateButton;
	}

	public void setUpdateButton(WebElement updateButton) {
		this.updateButton.click();
	}
	
}

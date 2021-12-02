package org.pom;

import org.baseClass.BaseClass_Junit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Junit_POM_Adactin_PersonalDetails extends BaseClass_Junit{

	public Junit_POM_Adactin_PersonalDetails() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement ccNum;

	@FindBy(id = "cc_type")
	private WebElement ccType;

	@FindBy(id = "cc_exp_month")
	private WebElement ccExpMo;

	@FindBy(id = "cc_exp_year")
	private WebElement ccExpYr;

	@FindBy(id = "cc_cvv")
	private WebElement ccCVV;

	@FindBy(id = "book_now")
	private WebElement bookNow;
	
	@FindBy(id = "order_no")
	private WebElement orderId;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMo() {
		return ccExpMo;
	}

	public WebElement getCcExpYr() {
		return ccExpYr;
	}

	public WebElement getCcCVV() {
		return ccCVV;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getOrderId() {
		return orderId;
	}	
}

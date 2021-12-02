package org.pom;

import org.baseClass.BaseClass_Junit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Junit_POM_Adactin_Booking_Confirmation extends BaseClass_Junit{

public Junit_POM_Adactin_Booking_Confirmation() {

PageFactory.initElements(driver, this);	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;

	@FindBy(id = "continue")
	private WebElement continueBooking;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinueBooking() {
		return continueBooking;
	}	
}

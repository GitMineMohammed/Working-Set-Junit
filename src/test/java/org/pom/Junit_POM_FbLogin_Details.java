package org.pom;

import org.baseClass.BaseClass_Junit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Junit_POM_FbLogin_Details extends BaseClass_Junit {

//Create a Constructor	
	
public Junit_POM_FbLogin_Details() {	
PageFactory.initElements(driver, this);	} // PageFactory - Pre-defined class ; initElements - Static method

@FindBy(id="email")
private WebElement username;	

@FindBy(id="pass")
private WebElement password;	

@FindBy(name="login")
private WebElement login;

public WebElement getUsername() {
	return username;}

public WebElement getPassword() {
	return password;}

public WebElement getLogin() {
	return login;}	
	
}
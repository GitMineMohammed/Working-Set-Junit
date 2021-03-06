package org.pom;

import org.baseClass.BaseClass_Junit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Junit_POM_Adactin_Login extends BaseClass_Junit {

	public Junit_POM_Adactin_Login() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	} }
package org.junit;

import org.baseClass.BaseClass_Junit;
import org.openqa.selenium.WebElement;
import org.pom.Junit_POM_FbLogin_Details;

public class Utilization_FbLogin_Junit extends BaseClass_Junit {

	public static void main(String[] args) {

		chromeLaunch("https://www.facebook.com/");

		Junit_POM_FbLogin_Details a = new Junit_POM_FbLogin_Details();

		WebElement txtUsername = a.getUsername();
		txtUsername.sendKeys("Mohammed");

		driver.navigate().refresh();

		String attribute = txtUsername.getAttribute("id");
		System.out.println(attribute);
	}
}

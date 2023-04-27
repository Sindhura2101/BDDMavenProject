package com.nopCommerce.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	public WebDriver lDriver;

	public AddNewCustomerPage(WebDriver rdriver) {
		lDriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
    By lnkCustomers_Menu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	By lnkCustomers_MenuItem=By.xpath("//p[text()=' Customers']");
	By btnAddNew = By.xpath("//a[@class ='btn btn-primary']");
	By txtEmail = By.xpath("//input[@id='Email']");
	By txtPassword = By.xpath("//input[@id='Password']");
	By txtFirstName = By.xpath("//input[@id='FirstName']");
	By txtLastName = By.xpath("//input[@id='LastName']");
	By radioButtonGenderMale = By.xpath("//input[@id='Gender_Male']");
	By radioButtonGenderFemale = By.xpath("//input[@id='Gender_Female']");
	By txtCompanyName=By.xpath("//input[@id='Company']");
	By txtAdminComment = By.xpath("//textarea[@id='AdminComment']");
	By btnSave = By.xpath("//button[@name='save']");

	public String getPageTitle() {
		return lDriver.getTitle();
	}

	public void clickOnCustomersMenu() {
		lDriver.findElement(lnkCustomers_Menu).click();
	}
	
	public void clickOnCustomersMenuItem() {
		lDriver.findElement(lnkCustomers_MenuItem).click();
	}

	public void clickOnAddNewButton() {
		lDriver.findElement(btnAddNew).click();
	}

	public void setEmail(String email) {
		lDriver.findElement(txtEmail).sendKeys(email);
	}

	public void setPassword(String password) {
		lDriver.findElement(txtPassword).sendKeys(password);
	}

	public void setFirstName(String fname) {
		lDriver.findElement(txtFirstName).sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		lDriver.findElement(txtLastName).sendKeys(lname);
	}
	
	public void SetGender(String gender) {
		if (gender.equals("Male")) {
			lDriver.findElement(radioButtonGenderMale).click();
		} else {
			lDriver.findElement(radioButtonGenderFemale).click();
		}
	}

	public void setCompanyName(String comName) {
		lDriver.findElement(txtCompanyName).sendKeys(comName);
	}

	public void setAdminComment(String adminComment) {
		lDriver.findElement(txtAdminComment).sendKeys(adminComment);
	}

	public void clickOnSave() {
		lDriver.findElement(btnSave).click();
	}
}

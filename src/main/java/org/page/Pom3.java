package org.page;

import javax.servlet.annotation.WebListener;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 extends BaseClass {
	

	public Pom3() {
    PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="radiobutton_0")
	private WebElement ordericon;
	
	
	@FindBy(id="continue")
	private WebElement continues;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cardno;
	
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement cardtype;

	public WebElement getOrdericon() {
		return ordericon;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}
	
	
	
	
	
	
	
	
	
	
	
}

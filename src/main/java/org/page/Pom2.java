package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 extends BaseClass {
	public Pom2() {
    PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="datepick_in")
	private WebElement date1;
	
	@FindBy(name="datepick_out")
	private WebElement date2;
	
	@FindBy(id="adult_room")
	private WebElement auroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement clk;
	
	@FindBy(xpath="(//td[@valign='top'])[4]")
	private WebElement print;

	public WebElement getPrint() {
		return print;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getAuroom() {
		return auroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getClk() {
		return clk;
	}
	
	
}

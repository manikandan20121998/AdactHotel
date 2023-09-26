package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 extends BaseClass{
	public Pom4() {
      PageFactory.initElements(driver, this);
	}

	@FindBy(id="cc_exp_month")
	private WebElement exmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement exyear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement book;
	
	@FindBy(id="my_itinerary")
	private WebElement literary;
	public WebElement getLiterary() {
		return literary;
	}
	public WebElement getExmonth() {
		return exmonth;
	}
	public WebElement getExyear() {
		return exyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	
}

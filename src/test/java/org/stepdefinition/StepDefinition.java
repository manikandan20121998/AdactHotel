package org.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.junit.Assert;
import org.page.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	public static  PageObjectManager pom;
	@Given("user must be in homepage of adacthotel application")
	public void user_must_be_in_homepage_of_adacthotel_application() {
     
	}

	@When("user pass the {string} and {string} in login page")
	public void user_pass_the_and_in_login_page(String user, String pass) {
    pom=new PageObjectManager();
    sendkeys(pom.getInstancepom1().getUser(),user);
    sendkeys(pom.getInstancepom1().getPass(), pass);
  //  Assert.assertTrue(false);
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
   click(pom.getInstancepom1().getLog());
	}

	@When("user choose location")
	public void user_choose_location() {
    selectbyvisibletext(pom.getInstancepom1().getLoc(), "London");
	}

	@When("user choose hotels")
	public void user_choose_hotels() {
selectbyindex(pom.getInstancepom1().getHo(), 1);
	}

	@When("user book roomtype")
	public void user_book_roomtype() {
selectbyindex(pom.getInstancepom1().getRoom(), 1);
	}

	@When("user has to choose roomno on that page")
	public void user_has_to_choose_roomno_on_that_page() {
selectbyindex(pom.getInstancepom1().getRoomno(), 3);
	}

	@When("user choose checkin and checkout options")
	public void user_choose_checkin_and_checkout_options() {
   sendkeys(pom.getInstancepom2().getDate1(), "17/11/2022");
   sendkeys(pom.getInstancepom2().getDate2(), "18/11/2022");
	}

	@When("user chhose adult and child details filled")
	public void user_chhose_adult_and_child_details_filled() {
selectbyindex(pom.getInstancepom2().getAuroom(), 3);
selectbyvalue(pom.getInstancepom2().getChildroom(), "2");
	}

	@When("user click final search button")
	public void user_click_final_search_button() {
click(pom.getInstancepom2().getClk());
	}

	@Then("user print order id in console")
	public void user_print_order_id_in_console() {
      String gettext = gettext(pom.getInstancepom2().getPrint());
        System.out.println(gettext);
	}
	@Given("user click the order id icon and click continue button")
	public void user_click_the_order_id_icon_and_click_continue_button() {
     click(pom.getInstancepom3().getOrdericon());
     click(pom.getInstancepom3().getContinues());
	}

	@When("user fill the remaing details of {string}and{string} creditials")
	public void user_fill_the_remaing_details_of_and_creditials(String first, String last) {
		sendkeys(pom.getInstancepom3().getFirstname(), first);  
	    sendkeys(pom.getInstancepom3().getLastname(), last);
	}

	@When("user fill the address in address text box")
	public void user_fill_the_address_in_address_text_box() {
        sendkeys(pom.getInstancepom3().getAddress(), "2/27,chennai,tondiarpet,600081");
	}

	@When("user fill the payment details of card no {string}and card type")
	public void user_fill_the_payment_details_of_card_no_and_card_type(String no) {
      sendkeys(pom.getInstancepom3().getCardno(), no);
      selectbyindex(pom.getInstancepom3().getCardtype(), 2);
	}
	
	@Given("user select month and year")
	public void user_select_month_and_year(io.cucumber.datatable.DataTable data) {
      scrolldown(pom.getInstancepom4().getBook());
      List<String> list = data.asList();
      String month = list.get(0);
      String year = list.get(1);
      click(pom.getInstancepom4().getExmonth());
      selectbyvisibletext(pom.getInstancepom4().getExmonth(), month);
      click(pom.getInstancepom4().getExyear());
      selectbyvisibletext(pom.getInstancepom4().getExyear(), year);
	}

	@When("user pass the cvv number {string}")
	public void user_pass_the_cvv_number(String cvv) {
      sendkeys(pom.getInstancepom4().getCvv(), cvv);
	}

	@Then("user click the book button")
	public void user_click_the_book_button() throws InterruptedException, IOException {
  click(pom.getInstancepom4().getBook());
  Thread.sleep(3000);
  scrolldown(pom.getInstancepom4().getLiterary());
  click(pom.getInstancepom4().getLiterary());
  Thread.sleep(6000);
  screenshot("adact");
	}
	
	
	
	
	
	
	
	
	
}

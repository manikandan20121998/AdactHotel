$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/adacthotel.feature");
formatter.feature({
  "name": "user book the hotel for staying purpose and bill the order id",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user book the hotel and print the bill in console",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user must be in homepage of adacthotel application",
  "keyword": "Given "
});
formatter.step({
  "name": "user pass the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in login page",
  "keyword": "When "
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "user choose location",
  "keyword": "And "
});
formatter.step({
  "name": "user choose hotels",
  "keyword": "And "
});
formatter.step({
  "name": "user book roomtype",
  "keyword": "And "
});
formatter.step({
  "name": "user has to choose roomno on that page",
  "keyword": "And "
});
formatter.step({
  "name": "user choose checkin and checkout options",
  "keyword": "And "
});
formatter.step({
  "name": "user chhose adult and child details filled",
  "keyword": "And "
});
formatter.step({
  "name": "user click final search button",
  "keyword": "And "
});
formatter.step({
  "name": "user print order id in console",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "manimaddy",
        "5WZ2NI"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user book the hotel and print the bill in console",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user must be in homepage of adacthotel application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_must_be_in_homepage_of_adacthotel_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass the \"manimaddy\" and \"5WZ2NI\" in login page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_pass_the_and_in_login_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose location",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_choose_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose hotels",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_choose_hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user book roomtype",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_book_roomtype()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to choose roomno on that page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_has_to_choose_roomno_on_that_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose checkin and checkout options",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_choose_checkin_and_checkout_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user chhose adult and child details filled",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_chhose_adult_and_child_details_filled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click final search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_final_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user print order id in console",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_print_order_id_in_console()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
@E2E
Feature: user book the hotel for staying purpose and bill the order id
@smoke
Scenario Outline: user book the hotel and print the bill in console
 
Given user must be in homepage of adacthotel application
When user pass the "<username>" and "<password>" in login page
And user click the login button
And user choose location
And user choose hotels
And user book roomtype
And user has to choose roomno on that page
And user choose checkin and checkout options
And user chhose adult and child details filled
And user click final search button
Then user print order id in console
Examples:
  |username  |  password|
  |manimaddy |  5WZ2NI  | 
@sanity
Scenario Outline:
User has to book the room by order id
Given user must be in homepage of adacthotel application
When user pass the "<username>" and "<password>" in login page
And user click the login button
And user choose location
And user choose hotels
And user book roomtype
And user has to choose roomno on that page
And user choose checkin and checkout options
And user chhose adult and child details filled
And user click final search button
Then user print order id in console
Given user click the order id icon and click continue button
When user fill the remaing details of "<firstname>"and"<lastname>" creditials
And user fill the address in address text box
And user fill the payment details of card no "1234567890987654"and card type 
Examples:
  |username  |  password|firstname|lastname|
  |manimaddy |  5WZ2NI  |manikandan|maddy|
@regression
Scenario Outline:

user pass the card details of expiry date and cvv then book
Given user must be in homepage of adacthotel application
When user pass the "<username>" and "<password>" in login page
And user click the login button
And user choose location
And user choose hotels
And user book roomtype
And user has to choose roomno on that page
And user choose checkin and checkout options
And user chhose adult and child details filled
And user click final search button
Then user print order id in console
Given user click the order id icon and click continue button
When user fill the remaing details of "<firstname>"and"<lastname>" creditials
And user fill the address in address text box
And user fill the payment details of card no "1234567890987654"and card type 
Given user select month and year
     |February|2022|  
When user pass the cvv number "123"
Then user click the book button
Examples:
  |username  |  password|firstname|lastname|
  |manimaddy |  5WZ2NI  |manikandan|maddy|

  
  
  
  
  
  
  
  
  
  
  
  
  


Feature: Conference Registration
  I want to register for a conference

 @executeregistration
 Scenario: Registration for a conference
  Given User is on Conference room booking page
  When User select 'Next' link without entering 'FirstName'  
  Then 'Please fill the First Name' message should display

  When User select 'Next' link without entering 'LastName'
  Then 'Please fill the Last Name' message should display

	When User select 'Next' link without entering 'Email'
  Then 'Please fill the Email' message should display

  When User select 'Next' link without entering 'Contact No'
  Then 'Please fill the Contact No.' message should display

  When User select 'Next' link without selecting  'Number of people attending'
  Then 'Please fill the Number of people attending' message should display
    
  When  User select 'Next' link without entereing  'Building Name & Room No'
  Then 'Please fill the Building & Room No' message should display
    
  When  User select 'Next' link without entereing  'Area Name'
  Then 'Please fill the Area name' message should display
    
  When  User select 'Next' link without selecting  'City'
  Then  'Please select city' message should display
    
  When   User select 'Next' link without selecting  'State'
  Then   'Please select state' message should display
    
  When User select 'Next' link without selecting  'MemeberShip Status'
  Then 'Please Select MemeberShip status' message should display
    
 	When  User select 'Next' link after entering Valid set of information
  Then 'Personal details are validated.' message should display

  When  User select 'MakePayment' link without selecting  'Card Holder name'
  Then 'Please fill the Card holder name' message should display
  
  When  User select 'MakePayment' link without selecting  'Debit Card Number'
  Then 'Please fill the Debit card Number' message should display
  
    When  User select 'MakePayment' link without selecting  'CVV'
  Then 'Please fill the CVV' message should display
  
   When  User select 'MakePayment' link without selecting  'expiration month'
  Then 'Please fill expiration month' message should display
  
   When  User select 'MakePayment' link without selecting  'expiration year'
  Then 'Please fill the expiration year' message should display
  
  When  User select 'MakePayment' link after entering Valid set of information
  Then 'Conference Room Booking successfully done!!!' message should display
  
  
  
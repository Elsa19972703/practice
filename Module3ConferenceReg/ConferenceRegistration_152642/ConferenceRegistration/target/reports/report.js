$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ConferenceRegistration.feature");
formatter.feature({
  "line": 3,
  "name": "Conference Registration",
  "description": "I want to register for a conference",
  "id": "conference-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 151894,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Registration for a conference",
  "description": "",
  "id": "conference-registration;registration-for-a-conference",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@executeregistration"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Conference room booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User select \u0027Next\u0027 link without entering \u0027FirstName\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "\u0027Please fill the First Name\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User select \u0027Next\u0027 link without entering \u0027LastName\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "\u0027Please fill the Last Name\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User select \u0027Next\u0027 link without entering \u0027Email\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "\u0027Please fill the Email\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User select \u0027Next\u0027 link without entering \u0027Contact No\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "\u0027Please fill the Contact No.\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User select \u0027Next\u0027 link without selecting  \u0027Number of people attending\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "\u0027Please fill the Number of people attending\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User select \u0027Next\u0027 link without entereing  \u0027Building Name \u0026 Room No\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "\u0027Please fill the Building \u0026 Room No\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User select \u0027Next\u0027 link without entereing  \u0027Area Name\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "\u0027Please fill the Area name\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User select \u0027Next\u0027 link without selecting  \u0027City\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "\u0027Please select city\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User select \u0027Next\u0027 link without selecting  \u0027State\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "\u0027Please select state\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User select \u0027Next\u0027 link without selecting  \u0027MemeberShip Status\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "\u0027Please Select MemeberShip status\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User select \u0027Next\u0027 link after entering Valid set of information",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "\u0027Personal details are validated.\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User select \u0027MakePayment\u0027 link without selecting  \u0027Card Holder name\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "\u0027Please fill the Card holder name\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "User select \u0027MakePayment\u0027 link without selecting  \u0027Debit Card Number\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "\u0027Please fill the Debit card Number\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "User select \u0027MakePayment\u0027 link without selecting  \u0027CVV\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "\u0027Please fill the CVV\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "User select \u0027MakePayment\u0027 link without selecting  \u0027expiration month\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "\u0027Please fill expiration month\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "User select \u0027MakePayment\u0027 link without selecting  \u0027expiration year\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "\u0027Please fill the expiration year\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "User select \u0027MakePayment\u0027 link after entering Valid set of information",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "\u0027Conference Room Booking successfully done!!!\u0027 message should display",
  "keyword": "Then "
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_is_on_Conference_room_booking_page()"
});
formatter.result({
  "duration": 4242078903,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_entering_FirstName()"
});
formatter.result({
  "duration": 133578964,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_the_First_Name_message_should_display()"
});
formatter.result({
  "duration": 26214643,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_entering_LastName()"
});
formatter.result({
  "duration": 155729915,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_the_Last_Name_message_should_display()"
});
formatter.result({
  "duration": 6608440,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_entering_Email()"
});
formatter.result({
  "duration": 130107968,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_the_Email_message_should_display()"
});
formatter.result({
  "duration": 5911059,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_entering_Contact_No()"
});
formatter.result({
  "duration": 228775812,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_the_Contact_No_message_should_display()"
});
formatter.result({
  "duration": 5930560,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_selecting_Number_of_people_attending()"
});
formatter.result({
  "duration": 179144772,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_the_Number_of_people_attending_message_should_display()"
});
formatter.result({
  "duration": 6576625,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_entereing_Building_Name_Room_No()"
});
formatter.result({
  "duration": 189947247,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_the_Building_Room_No_message_should_display()"
});
formatter.result({
  "duration": 6141467,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_entereing_Area_Name()"
});
formatter.result({
  "duration": 216369206,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_the_Area_name_message_should_display()"
});
formatter.result({
  "duration": 6239994,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_selecting_City()"
});
formatter.result({
  "duration": 148492857,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_select_city_message_should_display()"
});
formatter.result({
  "duration": 5668849,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_selecting_State()"
});
formatter.result({
  "duration": 187745289,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_select_state_message_should_display()"
});
formatter.result({
  "duration": 8655425,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_selecting_MemberShip_Status()"
});
formatter.result({
  "duration": 188667946,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_Select_MemeberShip_status_message_should_display()"
});
formatter.result({
  "duration": 5683218,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_after_entering_Valid_set_of_information()"
});
formatter.result({
  "duration": 132664005,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.personal_details_are_validated_message_should_display()"
});
formatter.result({
  "duration": 1004664087,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_selecting_Card_Holder_name()"
});
formatter.result({
  "duration": 156057822,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_the_Card_holder_name_message_should_display()"
});
formatter.result({
  "duration": 5708876,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_selecting_Debit_Card_Number()"
});
formatter.result({
  "duration": 121497701,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_the_Debit_card_Number_message_should_display()"
});
formatter.result({
  "duration": 7293505,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_MakePayment_link_without_selecting_CVV()"
});
formatter.result({
  "duration": 150923170,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_the_CVV_message_should_display()"
});
formatter.result({
  "duration": 4092943,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_selecting_expiration_month()"
});
formatter.result({
  "duration": 127192721,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_expiration_month_message_should_display()"
});
formatter.result({
  "duration": 5378403,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_Next_link_without_selecting_expiration_year()"
});
formatter.result({
  "duration": 143013362,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.please_fill_expiration_year_message_should_display()"
});
formatter.result({
  "duration": 4131430,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.user_select_MakePayment_link_after_entering_Valid_set_of_information()"
});
formatter.result({
  "duration": 124147132,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceRegistrationStepDefinition.conference_Room_Booking_successfully_done_message_should_display()"
});
formatter.result({
  "duration": 1021676280,
  "status": "passed"
});
formatter.after({
  "duration": 115350075,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/MeerQATS_Login.feature");
formatter.feature({
  "name": "User is able to login into application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Launch the browser",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.User_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Complete Questionnaire and send for Review",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Third"
    }
  ]
});
formatter.step({
  "name": "User enter the the MeerQATS login page",
  "keyword": "When "
});
formatter.match({
  "location": "Step.User_enter_the_the_MeerQATS_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After Verifying login page title",
  "keyword": "And "
});
formatter.match({
  "location": "Step.After_Verifying_login_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Username and Password and click login",
  "keyword": "And "
});
formatter.match({
  "location": "Step.User_enters_Username_and_Password_and_click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter MeerQATS HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.User_enter_MeerQATS_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on My Work",
  "keyword": "When "
});
formatter.match({
  "location": "Step.User_Clicks_on_My_Work()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on Selecting a Review Case",
  "keyword": "And "
});
formatter.match({
  "location": "Step.on_Selecting_a_Review_Case()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After Completing the Questionnaire Click on Submit Review",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.After_Completing_the_Questionnaire_Click_on_Submit_Review()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
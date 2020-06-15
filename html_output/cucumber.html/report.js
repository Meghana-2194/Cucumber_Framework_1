$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Java Selenium/CucumberFramework/CucumberPOMConcepts/src/main/java/com/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber POM",
  "description": "",
  "id": "cucumber-pom",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate login Page",
  "description": "",
  "id": "cucumber-pom;validate-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "opens url",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enters username and password and login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_opens_browser()"
});
formatter.result({
  "duration": 12036496300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.opens_url()"
});
formatter.result({
  "duration": 17773700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 26500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.enters_username_and_password()"
});
formatter.result({
  "duration": 581400,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.sendKeys(Unknown Source)\r\n\tat com.qa.pages.LoginPage.login(LoginPage.java:34)\r\n\tat com.qa.stepDefinition.LoginStepDefinition.enters_username_and_password(LoginStepDefinition.java:37)\r\n\tat ✽.Then enters username and password and login(C:/Java Selenium/CucumberFramework/CucumberPOMConcepts/src/main/java/com/qa/features/login.feature:8)\r\n",
  "status": "failed"
});
});
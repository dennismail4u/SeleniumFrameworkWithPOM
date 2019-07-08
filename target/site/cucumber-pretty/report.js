$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPageTests.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Login Validations",
  "description": "",
  "id": "freecrm-login-validations",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4394038406,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#Below is data driven testing in cucumber without Example"
    }
  ],
  "line": 4,
  "name": "FreeCRM login positive scenario with step parameter",
  "description": "",
  "id": "freecrm-login-validations;freecrm-login-positive-scenario-with-step-parameter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTests"
    },
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@FreeCRM"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "CRM logo is present",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify the page title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter login credentials \"dennismail4u@gmail.com\" and verify home page label name",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTests.login()"
});
formatter.result({
  "duration": 153603992,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTests.crm_logo_is_present()"
});
formatter.result({
  "duration": 280160888,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTests.login_and_verify_the_page_title()"
});
formatter.result({
  "duration": 2762896,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dennismail4u@gmail.com",
      "offset": 25
    }
  ],
  "location": "LoginPageTests.enter_login_credentials_and_verify_home_page_label_name(String)"
});
formatter.result({
  "duration": 3765761256,
  "status": "passed"
});
formatter.after({
  "duration": 606483534,
  "status": "passed"
});
});
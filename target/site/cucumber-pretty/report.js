$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactsPageTests.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Contacts Page Validations",
  "description": "",
  "id": "freecrm-contacts-page-validations",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4891684138,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "FreeCRM contacts page positive scenario",
  "description": "",
  "id": "freecrm-contacts-page-validations;freecrm-contacts-page-positive-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@FreeCRM"
    },
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user on the contacts Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on new button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user fills firstname and lastname and save",
  "rows": [
    {
      "cells": [
        "testfirstname",
        "testlastname"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsPageTests.user_on_the_contacts_Page()"
});
formatter.result({
  "duration": 4495238548,
  "status": "passed"
});
formatter.match({
  "location": "ContactsPageTests.user_clicks_on_new_button()"
});
formatter.result({
  "duration": 560223228,
  "status": "passed"
});
formatter.match({
  "location": "ContactsPageTests.user_fills_firstname_and_lastname_and_save(DataTable)"
});
formatter.result({
  "duration": 1414958753,
  "status": "passed"
});
formatter.after({
  "duration": 584491499,
  "status": "passed"
});
formatter.uri("HomePageTests.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM HomePage Validations",
  "description": "",
  "id": "freecrm-homepage-validations",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3578765225,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "FreeCRM homepage positive scenario",
  "description": "",
  "id": "freecrm-homepage-validations;freecrm-homepage-positive-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@FreeCRM"
    },
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify homepage title",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "verify username label",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verify contacts link",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageTest.user_on_home_page()"
});
formatter.result({
  "duration": 3472957582,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verify_homepage_title()"
});
formatter.result({
  "duration": 4376767,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verify_username_label()"
});
formatter.result({
  "duration": 563262572,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verify_contacts_link()"
});
formatter.result({
  "duration": 290907785,
  "status": "passed"
});
formatter.after({
  "duration": 581905293,
  "status": "passed"
});
formatter.uri("LoginPageTests.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Login Validations",
  "description": "",
  "id": "freecrm-login-validations",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3651642441,
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
  "location": "LoginPageTest.login()"
});
formatter.result({
  "duration": 602591,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.crm_logo_is_present()"
});
formatter.result({
  "duration": 578383806,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.login_and_verify_the_page_title()"
});
formatter.result({
  "duration": 3185699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dennismail4u@gmail.com",
      "offset": 25
    }
  ],
  "location": "LoginPageTest.enter_login_credentials_and_verify_home_page_label_name(String)"
});
formatter.result({
  "duration": 3501959289,
  "status": "passed"
});
formatter.after({
  "duration": 591391302,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 10,
      "value": "#For data table example, look at contacts test."
    },
    {
      "line": 11,
      "value": "#Below is with Examples and Scenario Outline\t [Just repeating above scenario only with examples]"
    }
  ],
  "line": 13,
  "name": "FreeCRM login positive scenario with Examples",
  "description": "",
  "id": "freecrm-login-validations;freecrm-login-positive-scenario-with-examples",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@FreeCRM"
    },
    {
      "line": 12,
      "name": "@specialCase"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "login",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "CRM logo is present",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "verify the page title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "enter login credentials \"\u003cusername\u003e\" and verify home page label name",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "freecrm-login-validations;freecrm-login-positive-scenario-with-examples;",
  "rows": [
    {
      "cells": [
        "username"
      ],
      "line": 20,
      "id": "freecrm-login-validations;freecrm-login-positive-scenario-with-examples;;1"
    },
    {
      "cells": [
        "dennismail4u@gmail.com"
      ],
      "line": 21,
      "id": "freecrm-login-validations;freecrm-login-positive-scenario-with-examples;;2"
    },
    {
      "cells": [
        "test@test.com"
      ],
      "line": 22,
      "id": "freecrm-login-validations;freecrm-login-positive-scenario-with-examples;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3704493727,
  "status": "passed"
});
formatter.before({
  "duration": 84997,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "FreeCRM login positive scenario with Examples",
  "description": "",
  "id": "freecrm-login-validations;freecrm-login-positive-scenario-with-examples;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@FreeCRM"
    },
    {
      "line": 12,
      "name": "@specialCase"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "login",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "CRM logo is present",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "verify the page title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "enter login credentials \"dennismail4u@gmail.com\" and verify home page label name",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.login()"
});
formatter.result({
  "duration": 911695,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.crm_logo_is_present()"
});
formatter.result({
  "duration": 581093848,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.login_and_verify_the_page_title()"
});
formatter.result({
  "duration": 2298303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dennismail4u@gmail.com",
      "offset": 25
    }
  ],
  "location": "LoginPageTest.enter_login_credentials_and_verify_home_page_label_name(String)"
});
formatter.result({
  "duration": 3439720504,
  "status": "passed"
});
formatter.after({
  "duration": 582761597,
  "status": "passed"
});
formatter.before({
  "duration": 3574181946,
  "status": "passed"
});
formatter.before({
  "duration": 40437,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "FreeCRM login positive scenario with Examples",
  "description": "",
  "id": "freecrm-login-validations;freecrm-login-positive-scenario-with-examples;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@FreeCRM"
    },
    {
      "line": 12,
      "name": "@specialCase"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "login",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "CRM logo is present",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "verify the page title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "enter login credentials \"test@test.com\" and verify home page label name",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.login()"
});
formatter.result({
  "duration": 506416,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.crm_logo_is_present()"
});
formatter.result({
  "duration": 579506953,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.login_and_verify_the_page_title()"
});
formatter.result({
  "duration": 2458981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 25
    }
  ],
  "location": "LoginPageTest.enter_login_credentials_and_verify_home_page_label_name(String)"
});
formatter.result({
  "duration": 8222865959,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.xpath: //*[contains(text(),\u0027Dennis Thomas\u0027)]\u0027 (tried for 5 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\n\tat com.util.TestUtil.waitForElementToBeVisible(TestUtil.java:22)\n\tat com.pages.HomePage.verifyCorrectUserName(HomePage.java:47)\n\tat com.StepDef.LoginPageTest.enter_login_credentials_and_verify_home_page_label_name(LoginPageTest.java:52)\n\tat ✽.Then enter login credentials \"test@test.com\" and verify home page label name(LoginPageTests.feature:17)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: //*[contains(text(),\u0027Dennis Thomas\u0027)]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027Denniss-MBP.fios-router.home\u0027, ip: \u0027fe80:0:0:0:463:a143:5e84:e1aa%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 67.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20190529130856, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 2448, moz:profile: /var/folders/17/9vplwdb13cd..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: MAC, platformName: MAC, platformVersion: 16.7.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 6d974f37-ce62-a04f-8487-54f6a8ed9387\n*** Element info: {Using\u003dxpath, value\u003d//*[contains(text(),\u0027Dennis Thomas\u0027)]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy21.isDisplayed(Unknown Source)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:315)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:44)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:301)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:298)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\n\tat com.util.TestUtil.waitForElementToBeVisible(TestUtil.java:22)\n\tat com.pages.HomePage.verifyCorrectUserName(HomePage.java:47)\n\tat com.StepDef.LoginPageTest.enter_login_credentials_and_verify_home_page_label_name(LoginPageTest.java:52)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat com.TestRunner.TestRunner.feature(TestRunner.java:31)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:85)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:639)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:816)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1124)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:108)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:774)\n\tat org.testng.TestRunner.run(TestRunner.java:624)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:359)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:354)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:312)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:261)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1191)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1116)\n\tat org.testng.TestNG.run(TestNG.java:1024)\n\tat org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:112)\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:205)\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:176)\n",
  "status": "failed"
});
formatter.after({
  "duration": 567539322,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8118131910,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user should be Login successfully,",
  "description": "so that user can use all functionality on website",
  "id": "login-feature;user-should-be-login-successfully,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@positive"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enter enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should be Login successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 291004988,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "User should not able to login with invalid credentials",
  "description": "",
  "id": "login-feature;user-should-not-able-to-login-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@negative"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter invalid userName \"\u003cUserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enter invalid password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on login Button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Use should not be able to login successfully with \"\u003creceive massage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "login-feature;user-should-not-able-to-login-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "receive massage"
      ],
      "line": 19,
      "id": "login-feature;user-should-not-able-to-login-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "admin",
        "Admin123",
        "Invalid credentials"
      ],
      "line": 20,
      "id": "login-feature;user-should-not-able-to-login-with-invalid-credentials;;2"
    },
    {
      "cells": [
        "",
        "admin123",
        "Username cannot be empty"
      ],
      "line": 21,
      "id": "login-feature;user-should-not-able-to-login-with-invalid-credentials;;3"
    },
    {
      "cells": [
        "Admin",
        "",
        "Password cannot be empty"
      ],
      "line": 22,
      "id": "login-feature;user-should-not-able-to-login-with-invalid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8211385010,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User should not able to login with invalid credentials",
  "description": "",
  "id": "login-feature;user-should-not-able-to-login-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@negative"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter invalid userName \"admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enter invalid password \"Admin123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on login Button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Use should not be able to login successfully with \"Invalid credentials\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 211346952,
  "status": "passed"
});
formatter.before({
  "duration": 6881723125,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User should not able to login with invalid credentials",
  "description": "",
  "id": "login-feature;user-should-not-able-to-login-with-invalid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@negative"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter invalid userName \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enter invalid password \"admin123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on login Button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Use should not be able to login successfully with \"Username cannot be empty\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 311091830,
  "status": "passed"
});
formatter.before({
  "duration": 13400668208,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User should not able to login with invalid credentials",
  "description": "",
  "id": "login-feature;user-should-not-able-to-login-with-invalid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@negative"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter invalid userName \"Admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enter invalid password \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on login Button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Use should not be able to login successfully with \"Password cannot be empty\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 2227439773,
  "status": "passed"
});
});
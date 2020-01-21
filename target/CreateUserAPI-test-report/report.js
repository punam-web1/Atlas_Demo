$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/CreateUserAPI.feature");
formatter.feature({
  "line": 2,
  "name": "Create User Details",
  "description": "",
  "id": "create-user-details",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@APITest"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Verify user creation",
  "description": "",
  "id": "create-user-details;verify-user-creation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@demo"
    },
    {
      "line": 5,
      "name": "@Dev"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Post endpoint given",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter Username and Job",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Post the api",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Get response",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUserAPIStepdef.startMethod()"
});
formatter.result({
  "duration": 4529049974,
  "status": "passed"
});
formatter.match({
  "location": "CreateUserAPIStepdef.enterdetails()"
});
formatter.result({
  "duration": 31893493,
  "status": "passed"
});
formatter.match({
  "location": "CreateUserAPIStepdef.postAPI()"
});
formatter.result({
  "duration": 29582926982,
  "status": "passed"
});
formatter.match({
  "location": "CreateUserAPIStepdef.getResponseTime()"
});
formatter.result({
  "duration": 7372826,
  "status": "passed"
});
});
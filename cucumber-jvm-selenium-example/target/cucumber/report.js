$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('br\com\unicamp\NonAuthorizedAcess\NonAuthorizedAcess.feature');
formatter.feature({
  "line": 1,
  "name": "Deny acess to unauthorized users",
  "description": "As an user\nI want to acess an out of bounds page\nSo that he can have access to sensible informations",
  "id": "deny-acess-to-unauthorized-users",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "results are shown",
  "description": "",
  "id": "deny-acess-to-unauthorized-users;results-are-shown",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the home page is open \"https://grupo-5-sade.herokuapp.com/#/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i sign in and and navigate to \"https://grupo-5-sade.herokuapp.com/#/user-management\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "an error should be shown",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://grupo-5-sade.herokuapp.com/#/",
      "offset": 23
    }
  ],
  "location": "NonAuthorizedAcessScenario.home_is_open(String)"
});
formatter.result({
  "duration": 4632105697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://grupo-5-sade.herokuapp.com/#/user-management",
      "offset": 31
    }
  ],
  "location": "NonAuthorizedAcessScenario.login_and_create_admin(String)"
});
formatter.result({
  "duration": 1452615850,
  "status": "passed"
});
formatter.match({
  "location": "NonAuthorizedAcessScenario.new_admin_created()"
});
formatter.result({
  "duration": 142345373,
  "status": "passed"
});
});
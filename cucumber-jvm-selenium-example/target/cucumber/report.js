$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('br\com\unicamp\EditProfile\EditProfile.feature');
formatter.feature({
  "line": 1,
  "name": "Edit a developer profile",
  "description": "As a developer registered at SADE\nI want to edit my profile\nSo that I can update my info",
  "id": "edit-a-developer-profile",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "results are shown",
  "description": "",
  "id": "edit-a-developer-profile;results-are-shown",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the page is open \"https://grupo-5-sade.herokuapp.com/#/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i sign in and edit my information",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the new information shows up at my profile",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://grupo-5-sade.herokuapp.com/#/",
      "offset": 18
    }
  ],
  "location": "EditProfileScenario.the_page_is_open(String)"
});
formatter.result({
  "duration": 2991036239,
  "status": "passed"
});
formatter.match({
  "location": "EditProfileScenario.fill_information()"
});
formatter.result({
  "duration": 3402251836,
  "status": "passed"
});
formatter.match({
  "location": "EditProfileScenario.registration_complete()"
});
formatter.result({
  "duration": 183432280,
  "status": "passed"
});
});
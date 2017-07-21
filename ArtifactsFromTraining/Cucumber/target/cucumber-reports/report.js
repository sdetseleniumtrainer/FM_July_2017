$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("github_login.feature");
formatter.feature({
  "line": 1,
  "name": "github login",
  "description": "",
  "id": "github-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login without username and password",
  "description": "",
  "id": "github-login;login-without-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on github homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is displayed login screen",
  "keyword": "Then "
});
formatter.match({
  "location": "github_login_step_definition.user_is_on_github_homepage()"
});
formatter.result({
  "duration": 7870517014,
  "status": "passed"
});
formatter.match({
  "location": "github_login_step_definition.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 144465223,
  "status": "passed"
});
formatter.match({
  "location": "github_login_step_definition.user_is_displayed_login_screen()"
});
formatter.result({
  "duration": 3906455739,
  "status": "passed"
});
});
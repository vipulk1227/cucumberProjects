$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features/Healthcheck.feature");
formatter.feature({
  "name": "Ecommerce project website Healthcheck",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user is able to open the browser,navigate to url and search for product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opened browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.HeathStep.user_opened_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigaed to home url",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.HeathStep.user_navigaed_to_home_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for product \"Laptop\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefination.HeathStep.user_search_for_product(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search result page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.HeathStep.search_result_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});
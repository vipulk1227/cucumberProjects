
Feature: Ecommerce project website Healthcheck

Scenario: user is able to open the browser,navigate to url and search for product
Given user opened browser
And user navigaed to home url
When user search for product "Laptop"
Then Search result page is displayed
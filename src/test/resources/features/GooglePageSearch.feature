
@PhaseOne
Feature: Google Search Function

Scenario: Java search
Given User is on Google Home Page
When User search Java Tutorial
Then should display Java Result Page

@SmokeTest
Scenario: Selenium search
Given User is on Google Home Page
When User search Selenium Tutorial
Then should display Selenium Result Page
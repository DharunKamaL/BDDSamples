
@PhaseTwo
Feature: Login Function

#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then should display Home Page

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "Dharun_K" and "dkvk2315"
#Then should display Home Page

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then should display Home Page

#Examples:
#	| username | password |
#	| testuser1 | welcome123 |
#	| testuser1 | welcome123 |
#	| Dharun_K | dkvk2315 |

@SmokeTest @RegressionTest
Scenario Outline: Valid Login
Given User is on Login Page
When User enters credentials
		|	uname |  pword	|
		| Dharun_K |	dkvk2315	|
Then should display Home Page
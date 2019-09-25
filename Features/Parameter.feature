Feature: login Feature

Scenario Outline: user enters username and password
Given login page is opened
When  enters "<username>" and passwords "<password>"
When  Click button
Then  uwill Finds testmeapp homepage

Examples:
  |username|password   |
  |Lalitha |Password123|
  |admin   |Password456|
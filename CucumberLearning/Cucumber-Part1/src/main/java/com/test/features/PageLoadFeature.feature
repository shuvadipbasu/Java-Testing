Feature: Page Load Feature

Scenario: User goes at login page

Given user is at login page of github
Then title of the page is The world’s leading software development platform · GitHub
Then user clicks on sign in button
Then user enters user name as user and password as pass
Then user login denied on submit
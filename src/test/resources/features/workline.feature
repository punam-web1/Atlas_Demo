Feature: Workline Hr
  As  web surfer, I want to check workline operation, so that I can learn new things.
  Background:
  Given a web browser on the Google page and we search the given url for workline
  Scenario:  Workline Login
  When we enter username and password
  And click on login button
  Then user should be able to login
 
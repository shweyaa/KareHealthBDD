Feature: Login to KareHealth Project
Background: I enter Url "http://karehealth.menpaniproducts.com/admin/auth/login"
  Scenario:Login into the application with valid credentials
Given i am at loginPage
  When enter username "admin"
  And enter Password "admin"
  And click on submit button
  Then i am navigated to the kareHealth Dashboard board and get page title

  Scenario:Login into the application with invalid credentials
    When enter username "adin"
    And enter Password "admin"
    And click on submit button
    Then i am notified with message "These credentials do not match our records."

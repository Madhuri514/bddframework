# Gherkin Language
# prereq = given
# action = click, send keys,    when
# validation  = then

# And

@STORY-1345
Feature: login functionality tests

  Background:
    Given user open chrome
    And user open url "https://www.saucedemo.com"

  @sanity @regression @login @JIRA-1234 @smoke
  Scenario: validate successful testcase
    When user login with username "standard_user" and password "secret_sauce"
    Then user validate successful login screen
    And user validate dashboard

  @smoke
  Scenario Outline: validate error msg
    When user enter username "<username>"
    And user enter password "<password>"
    And user enter login button
    Then user validate error msg "<errormsg>"

    Examples:
      | username      | password     | errormsg             |
      |               | secret_sauce | Username is required |
      | standard_user |              | Password is required |



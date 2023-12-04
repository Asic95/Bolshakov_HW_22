Feature: WebSite registration
  Check if I can use some specific emails to end the registration

  Scenario Outline: Check different email during registration
    Given I use "<email>"
    When Try to create new account on the website
    Then I received message "<result>"

    Examples:
      | email              | result |
      | test@testh2.com    | CREATE AN ACCOUNT  |
      | test@test.test     | An account using this email address has already been registered. Please enter a valid password or request a new one.   |
      | 111                | Invalid email address.   |
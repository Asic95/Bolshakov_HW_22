Feature: WebSite registration
  Check if I can use some specific emails to end the registration
  
  Scenario Outline: Check age of students

    Given The following student <name> and <age> and <course>
    When the students are sorted by age
    Then the youngest student is at least 16 years old

    Examples:
      | name | age | course |
      | Olha | 28  | 3      |
      | Anna | 23  | 5      |
      | Ivan | 16  | 2      |
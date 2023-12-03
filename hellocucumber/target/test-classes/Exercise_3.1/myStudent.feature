Feature: Check age of students
  Check if age is okay

  Scenario Outline: Check age of students

    Given The following student <name>, <age>, <course>
    When the students are sorted by age
    Then the youngest student is at least 16 years old

    Examples:
      | name | age | course |
      | Olha | 28  | 3      |
      | Anna | 23  | 5      |
      | Ivan | 18  | 2      |
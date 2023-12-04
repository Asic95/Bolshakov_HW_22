Feature: Students

    Scenario: Check age of students

        Given the following students information:
            | name | age | course |
            | Ivan | 18  | 2      |
            | Anna | 23  | 5      |
            | Olha | 28  | 3      |

        When the students are sorted by age

        Then the youngest student is at least 16 years old
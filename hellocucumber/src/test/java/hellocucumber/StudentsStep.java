package hellocucumber;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StudentsStep {

    private List<Student> students;

    @DataTableType
    public Student studentDataTable(Map<String, String> row) {
        String name = row.get("name");
        int age = Integer.parseInt(row.get("age"));
        int course = Integer.parseInt(row.get("course"));

        return new Student(name, age, course);
    }

    @Given("the following students information:")
    public void givenTheFollowingStudentsInformation(List<Student> students) {
        this.students = students;
    }

    @When("the students are sorted by age")
    public void studentsSortedByAge() {
        students.sort(Comparator.comparingInt(Student::getAge));
    }

    @Then("the youngest student is at least {int} years old")
    public void thenTheYoungestStudentIsAtLeast(int minAge) {
        int youngestAge = students.get(0).getAge();
        System.out.println(youngestAge + ">=" + minAge);
        Assert.assertTrue(youngestAge >= minAge);
    }
}
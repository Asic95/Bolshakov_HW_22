package Exercise_33;

import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentsStep {

    private List<Student> students;

    @Given("The following student {string}, {int}, {int}")
    public void the_following_student(String name, int age, int course) {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setCourse(course);
        studentList.add(student);
        this.students = studentList;
    }

    @When("the students are sorted by age")
    public void studentsSortedByAge() {
        List<Student> sortedByAge = students.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .toList();

        sortedByAge.forEach(student ->
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Course: " + student.getCourse()));
        this.students = sortedByAge;
    }

    @Then("the youngest student is at least {int} years old")
    public void thenTheYoungestStudentIsAtLeast(int minAge) {
        int youngestAge = students.get(0).getAge();
        System.out.println(youngestAge + ">=" + minAge);
        Assert.assertTrue(youngestAge >= minAge);
    }
}

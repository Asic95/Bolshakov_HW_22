package hellocucumber;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student students = (Student) o;
        return age == students.age && course == students.course && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

}

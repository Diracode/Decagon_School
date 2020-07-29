package dira.school;

import static org.junit.Assert.*;

public class StudentsTest {
    private Students student;
    private Courses course;

    @org.junit.Before
    public void setup() {
        student = new Students("Odira", 16, "female",222);
        course = new Courses("Accounting", 9897, 3.0);
        System.out.println("Running a  test...");
    }

    @org.junit.Test
    public void takeCourse_Check() {
        String result = student.takeCourse(course);
        assertEquals(course + " registered", result);
    }
}
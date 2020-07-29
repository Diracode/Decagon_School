package dira.school;

import static org.junit.Assert.*;

public class PrincipalTest {
    private Principal principal;
    private Applicants applicant;
    private Students student;

    @org.junit.Before
    public void setup() {
        principal = new Principal("Fred", 50, "female");
        applicant = new Applicants("Shola", 17, "male",1111);
        student = new Students("Mark", 19, "male",115);
        System.out.println("Running a  test...");
    }

    @org.junit.Test
    public void expelStudent_Test() {
        String value = principal.expelStudent(student);
        assertEquals(student.getName() + " expelled.", value);
    }

    @org.junit.Test
    public void admitStudent_Test() {
        String value = principal.admitStudent(applicant);
        assertEquals(applicant.getName() + " admitted.", value);
    }
}
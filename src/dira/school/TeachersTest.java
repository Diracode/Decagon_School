package dira.school;

import static org.junit.Assert.*;

public class TeachersTest {
    private Teachers teacher;

    @org.junit.Before
    public void setup() {
        teacher = new Teachers("Sandra", 30, "female", 112);
        System.out.println("Running a  test...");
    }
    @org.junit.Test
    public void takeAttendance_Test() {
        String value = teacher.takeAttendance();
        assertEquals("Marked", value);
    }
}
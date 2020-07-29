package dira.school;

public class NonAcademicStaff extends Person implements IAttendance {
    private int nonStaffId;
    private String department;

    public NonAcademicStaff(String name, int age, String gender, String function, int nonStaffId, String department) {
        super(name, age, gender, function);
        this.nonStaffId = nonStaffId;
        this.department = department;
    }

    public int getNonStaffId() {
        return nonStaffId;
    }


    public String getDepartment() {
        return department;
    }

    @Override
    public String takeAttendance() {
        //System.out.println("Marked");
        return "Marked";
    }
}

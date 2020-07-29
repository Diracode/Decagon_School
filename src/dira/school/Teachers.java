package dira.school;

public class Teachers extends Person implements IAttendance{
    private int staffId;

    public Teachers(String name, int age, String gender, int staffId) {
        super(name, age, gender, "teacher");
        this.staffId = staffId;
    }

    @Override
    public String takeAttendance() {
        return "Marked";
    }
}

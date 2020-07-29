package dira.school;

public class School {
    private String name;
    ////COMPOSITION
    private Staff staff;
    private Students student;
    private Courses course;
    private Classes level;
    private Applicants applicant;
    //////////////


    /////////// CONSTRUCTOR
    public School(String name, Staff staff, Students student, Courses course, Classes level, Applicants applicant) {
        this.name = name;
        this.staff = staff;
        this.student = student;
        this.course = course;
        this.level = level;
        this.applicant = applicant;
    }
    ///////////

    //////////GETTERS
    public String getName() {
        return name;
    }

    public Staff getStaff() {
        return staff;
    }

    public Students getStudent() {
        return student;
    }

    public Courses getCourse() {
        return course;
    }

    public Classes getLevel() {
        return level;
    }

    public Applicants getApplicant() {
        return applicant;
    }


}

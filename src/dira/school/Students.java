package dira.school;

/////AGGREGATION
public class Students extends Person {
    private int studentId;
    //On instantiation student has no registered courses.
    private Courses subject;

    ////CONSTRUCTOR
    public Students(String name, int age, String gender, int studentId) {
        super(name, age, gender, "student");
        this.studentId = studentId;
    }
    ////////////

    //////GETTERS AND SETTERS
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Courses getSubject() {
        return subject;
    }

    public void setSubject(Courses subject) {
        this.subject = subject;
    }

    //METHOD TO IMPLEMENT THE FUNCTION OF A STUDENT REGISTERING/TAKING A COURSE
    public String takeCourse(Courses subject) {
        return subject + " registered";
    }
}

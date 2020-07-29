package dira.school;

/////AGGREGATION
public class Courses {
    private String name;
    private int courseCode;
    private double courseGrade;

    public Courses(String name, int courseCode, double courseGrade) {
        this.name = name;
        this.courseCode = courseCode;
        this.courseGrade = courseGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public double getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(double courseGrade) {
        this.courseGrade = courseGrade;
    }

}

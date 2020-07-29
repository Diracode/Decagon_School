package dira.school;

public class Applicants extends Person {
    private int interviewNumber;

    public Applicants() {
        /* Using this() constructor to refer to the 1st constructor incase the
           Applicant() is instantiated without parameters */
        this("default name", 0 , "default gender", 000);
    }
    ////// FIRST CONSTRUCTOR WITH ALL PARAMETERS
    public Applicants(String name, int age, String gender, int interviewNumber) {
        super(name, age, gender, "applicant");
        this.interviewNumber = interviewNumber;
    }

    public int getInterviewNumber() {
        return interviewNumber;
    }

    public void setInterviewNumber(int interviewNumber) {
        this.interviewNumber = interviewNumber;
    }

    public void apply() {

    }
}

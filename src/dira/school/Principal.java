package dira.school;

public class Principal extends Person {
    ////    Constructor using this().
    public Principal() {    // Calling 2nd constructor.
        this("Default name", 16, "Default gender");
    }

    ////// 1st CONSTRUCTOR
    public Principal(String name, int age, String gender) {
        super(name, age, gender, "principal");
    }

    ////// Overriding the method so the function of a principal cannot be reset.
    @Override
    public void setFunction(String function) {
        try {
            throw new Exception("Function cannot be reset");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String expelStudent(Students student) {
        return student.getName() + " expelled.";
    }

    public String admitStudent(Applicants applicant) {
        String action;
        if (!checkApplicantAge(applicant)) {
            action = applicant.getName() + "'s admission denied";
        } else {
            action = applicant.getName() + " admitted.";
        }
        return action;
    }


    ///////////ENCAPSULATION OF APPLICANT'S AGE VALIDATION
    private boolean checkApplicantAge(Applicants applicant) {
        boolean offAge;
        if (applicant.getAge() < 16) {
            offAge = false;
        } else {
            offAge = true;
        }
        return offAge;
    }
}

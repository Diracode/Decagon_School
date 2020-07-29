package dira.school;

/////AGGREGATION AND COMPOSITION
public class Staff {
    private Principal principal;
    private Teachers teacher;
    private NonAcademicStaff staff;

    public Staff(Principal principal, Teachers teacher, NonAcademicStaff staff) {
        this.principal = principal;
        this.teacher = teacher;
        this.staff = staff;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public NonAcademicStaff getStaff() {
        return staff;
    }
}

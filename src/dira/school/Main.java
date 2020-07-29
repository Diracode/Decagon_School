package dira.school;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Students kane = new Students("Kane", 16, "male", 110);
    Teachers han = new Teachers("Han",34, "male", 111);
    Principal principal = new Principal("Mathew",45, "Male");
        System.out.println(principal.expelStudent(kane));
        System.out.println(principal.getName());
        System.out.println(han.takeAttendance());

    }
}

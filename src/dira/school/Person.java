package dira.school;

//BASE ABSTRACT CLASS PERSON
abstract class Person {
    // Abstract class for classes involving individuals of the department.
    // ABSTRACT BECAUSE IT WILL NOT BE INSTANTIATED NOW OR IN FUTURE.
    private String name;
    private  int age;
    private String gender;
    private String function;
    // specifies the role of individuals.

    public Person(String name, int age, String gender, String function) { //CONSTRUCTOR
        this.name = name;
        if (age < 16) { //// Validate age
            this.age = 0;
        } else {
            this.age = age;
        }
        this.gender = gender;
        this.function = function;
    }

    ///////   GETTERS AND SETTERS
    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
    //////////////////////////////
}

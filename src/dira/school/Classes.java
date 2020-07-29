package dira.school;

/////AGGREGATION
public class Classes {
    private String name;
    private int classLevel;

    public Classes(String name, int classLevel) {
        this.name = name;
        //classLevel should not be less the 0. If input is < 0,then classLevel should be 0
        if (classLevel < 0) {

            this.classLevel = 0;
        } else {
            this.classLevel = classLevel;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    public void increaseClassCapacity(int number) throws Exception {
        /* Validate if class capacity of 50 has been reached*/
        final int classCapacity = 50;
        if (classLevel == classCapacity) {
            throw new Exception("Maximum number of students in this class has been reached. Admissions closed");
        } else {
            classLevel += number;
        }
    }
}

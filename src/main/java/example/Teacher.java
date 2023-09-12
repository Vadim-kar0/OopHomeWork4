package example;

public class Teacher extends User{
     private int age;
    private int workExperience;

    public Teacher(String name, int age, int workExperience) {
        super(name);
        this.age = age;
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Teacher{" + getName() +
                "objectToTeach='" + age + '\'' +
                ", workExperience=" + workExperience +
                "}\n";
    }

    public int getObjectToTeach() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name, int age) {
        super(name);
        this.age = age;
    }

    public Teacher(String name) {
        super(name);
    }
}

package Task2;

import example.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age, int workExperience) {
        Teacher teacher = new Teacher(name,age,workExperience);
        teachers.add(teacher);
    }
    public void setTeacher(int index,String name,int age,int workExperience){
        teachers.set(index,new Teacher(name, age, workExperience));
    }
}

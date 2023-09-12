package example;


import Task2.StudentService;
import Task2.TeacherService;
import Task2.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Student student1 = new Student("Student1",6,29);
//        Student student2 = new Student("Student2",10,19);
//        List<Student> list = new ArrayList<>();
//        list.add(student2);
//        list.add(student1);
//        System.out.println(list);
//        list.sort(new StudentComporator());
//        System.out.println(list);
//        List<User> userList = new ArrayList<>();
//        Teacher teacher1 = new Teacher("Teacher1","Math");
//        Teacher teacher2 = new Teacher("Teacher2","Biology");
//        Teacher teacher3 = new Teacher("Teacher3","English");
//        Student student = new Student("Student", 52,19);
//        userList.add(student);
//        userList.add(student1);
//        userList.add(student2);
//        userList.add(teacher1);
//        userList.add(teacher2);
//        userList.add(teacher3);
//        System.out.println(userList);
//        userList.sort(new UserComporator<User>());
//        System.out.println(userList);
//        StudentService studentService = new StudentService();
//        studentService.create("Student1",10,11);
//        studentService.create("Student2",14,12);
//        studentService.create("Student3",17,19);
//        System.out.println(studentService.getAll());
        /////////////////////////////////////////////////////////////////////////
        TeacherService teacherService = new TeacherService();
        teacherService.create("Teacher1",55,11);
        teacherService.create("Teacher2",65,22);
        teacherService.create("Teacher3",75,44);
        teacherService.create("Teacher4",85,66);
        teacherService.create("Teacher5",45,1);
        List<Teacher> teachers = teacherService.getAll();
        teachers.sort(new TeacherComparator());
        System.out.println(teachers);
        teacherService.setTeachers(teachers);
        teacherService.setTeacher(3,"newTeacher",88,88);
        System.out.println(teacherService.getAll());



    }
}
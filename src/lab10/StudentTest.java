package lab10;

import java.util.Stack;

public class StudentTest {
    public static Stack<Student> students;
    public static void main(String[] args){
        students = new Stack<Student>();
        for(int i = 0; i < 5; i++) {
            students.add(new Student());
        }
        Student.Show(students);
        Student.Sort(students);
        System.out.println();
        Student.Show(students);
    }
}

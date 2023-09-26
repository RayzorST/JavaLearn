package lab11;

import java.util.Stack;

public class StudentTest {
    public static Stack<Student> students1;
    public static Stack<Student> students2;
    public static void main(String[] args){
        students1 = new Stack<Student>();
        for(int i = 0; i < 5; i++) {
            students1.add(new Student());
        }
        students2 = new Stack<Student>();
        for(int i = 0; i < 5; i++) {
            students2.add(new Student());
        }
        Student.Show(students1);
        System.out.println();
        Student.Show(students2);
        System.out.println();
        System.out.println(Student.sort(students1, students2));
    }
}

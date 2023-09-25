package lab10;

import java.util.Comparator;
import java.util.Stack;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.ID - o2.ID;
    }

    public void sort(Stack<Student> studetns){

    }
}

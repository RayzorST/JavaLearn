package lab11;

import java.util.Comparator;
import java.util.Stack;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.ID - o2.ID;
    }

    public void sort(Stack<Student> studetns, int low, int high){
        if(low >= high) return;

        int mid = low + (high - low) / 2;
        int opora = studetns.get(mid).ID;
        int i = low, j = high;
        while(i <= j){
            while(studetns.get(i).ID < opora){
                i++;
            }

            while(studetns.get(j).ID > opora){
                j--;
            }

            if(i <= j){
                Student temp = studetns.get(i);
                studetns.setElementAt(studetns.get(j), i);
                studetns.setElementAt(temp, j);
                i++;
                j--;
            }

            if(low < j) sort(studetns, low, j);

            if(high > i) sort(studetns, i, high);
        }
    }
}

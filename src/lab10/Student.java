package lab10;

import java.util.Stack;

public class Student {
    public int ID;
    public Student(){
        ID = (int)(Math.random() * 100);
    }

    public static void Sort(Stack<Student> students){
        int n = students.size();
        for(int i = 0; i < n; i++ ){
            Student buf = students.get(i);
            int j = i - 1;

            while(j>= 0 && students.get(j).ID > buf.ID){
                students.set(j + 1, students.get(j));
                j--;
            }

            students.set(j+1, buf);
            
        }

    }

    public static void Show(Stack<Student> students){
        for(int i = 0; i < students.size(); i++) System.out.print(students.get(i).ID + " ");
    }
}

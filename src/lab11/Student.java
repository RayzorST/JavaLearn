package lab11;

import java.util.Stack;

public class Student {
    public int ID;
    public Student(){
        ID = (int)(Math.random() * 100);
    }
    public Student(int a) { ID = a; }

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

    public static Stack<Student> sort(Stack<Student> students1, Stack<Student> students2){
        Stack<Student> result = new Stack<>();
        int i = 0, j = 0;

        for(int k = 0; k < (students1.size() + students2.size()); k++) result.add(new Student(0));

        for(int k = 0; k < result.size(); k++){

            if(i > students1.size() - 1){
                Student a = students2.get(j);
                result.insertElementAt(a, k);
                j++;
            }
            else if(j > students2.size() - 1){
                Student a = students1.get(i);
                result.insertElementAt(a, k);
                i++;
            }
            else if(students1.get(i).ID < students2.get(j).ID){
                Student a = students1.get(i);
                result.insertElementAt(a, k);
                i++;
            }
            else{
                Student a = students2.get(j);
                result.insertElementAt(a, k);
                j++;
            }
        }
        return result;
    }

    public static void Show(Stack<Student> students){
        for(int i = 0; i < students.size(); i++) System.out.print(students.get(i).ID + " ");
    }
}

package lab2;

public class mas {
    int[] m;
    public static void main(String[] args){
        var m = new mas();
        m.m = new int[5];
        m.Create();
        m.Show();
        m.Sort();
        System.out.println("\n--------------");
        m.Show();
    }

    public void Create(){
        for(int i = 0; i < m.length; i++) m[i] = (int)(Math.random() * 100);
    }

    public void Show(){
        for (int j : m) System.out.print(j + " ");
    }

    public void Sort(){
        int f = 0;
        while(f < 3){
            for(int i = 0; i < m.length - 1; i++){
                if(m[i] < m[i + 1]){
                    int buf = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = buf;
                    f--;
                }
                else f++;
            }
        }
    }
}

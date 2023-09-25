package lab2;

public class Program {
    public static void main(String[] srgs){
        System.out.println(sumFor(10));
        System.out.println(sumWhile(10) + "\n");
        For(10);
        System.out.println(fac(3));
    }


    public static int sumFor(int b){
        int a = 0;
        for(int i = 0; i < b; i++) a += i;
        return a;
    }

    public static int sumWhile(int b){
        int a = 0, i = 0;
        while(i < b) { a += i; i++; }
        return a;
    }

    public static void For(int b){
        for(int i = 0; i < b; i++) System.out.println(i);
    }

    public static int fac(int a){
        int b = 1;
        for(int i = 1; i <= a;i++) b *= i;
        return b;
    }
}

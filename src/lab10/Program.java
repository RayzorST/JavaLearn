package lab10;

public class Program {
    public static int[] k = new int[] {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
    public static void main(String[] args){
        //TriangularSequence(-1, 1, 4);
        System.out.print(SumOfDigits(320));
    }


    public static void TriangularSequence(int pos, int a , int b){
        if(pos == -1){
            for(int i = 0; i < k.length; i++){
                if(k[i] == a) {
                    pos = i;
                    break;
                }
            }
        }
        if(k.length <= pos) return;
        System.out.print(k[pos] + " ");

        if(k[pos] == b) return;
        TriangularSequence(a < b ? pos + k[pos] : pos - k[pos] + 1, a, b);
    }

    public static int SumOfDigits(int d){
        int buf = d % 10;
        if (d > 1) return buf + SumOfDigits(d / 10);
        else return buf;
    }
}

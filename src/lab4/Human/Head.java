package lab4.Human;

public class Head {
    private int[] eye;
    private Boolean nose;
    private Boolean mouth;

    public Head(int eye, Boolean nose, Boolean mouth){
        this.eye = new int[eye];
        for(int i = 0; i < eye; i++) this.eye[i] = (int) (Math.random() * 100);
        this.nose = nose;
        this.mouth = mouth;
    }

    public Head(int[] eye, Boolean nose, Boolean mouth){
        this.eye = eye;
        this.nose = nose;
        this.mouth = mouth;
    }

    public Boolean isHealthy(){
        return eye.length == 2 & nose & mouth;
    }
}

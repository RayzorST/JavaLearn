package lab4.Human;

public class Leg {
    private Boolean foot;
    private Boolean ankle;

    public Leg(Boolean foot, Boolean ankle){
        this.ankle = ankle;
        this.foot = foot;
    }

    public Boolean isHealthy(){
        return foot & ankle;
    }
}

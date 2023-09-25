package lab4.Human;

public class Human {
    public Head head;
    public Leg[] legs;
    public Hand[] hands;

    public static void main(String[] args){

    }

    public Human(){
        head = new Head(2, true, true);

        legs = new Leg[2];
        for(Leg l : legs) l = new Leg(true, true);

        hands = new Hand[2];
        for(Hand h : hands) h = new Hand(true);
    }

    public Boolean isHealth(){
        Boolean result = true;
        result = result & head.isHealthy();
        for(Leg l : legs) result = result & l.isHealthy();
        for(Hand h : hands) result = result & h.isHealthy();
        return result;
    }
}

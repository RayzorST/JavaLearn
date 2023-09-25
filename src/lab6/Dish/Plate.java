package lab6.Dish;

public class Plate implements Dish {
    float Radius;
    float Depth;

    private static final float SDepth = 50, SRadius  = 220;

    public Plate(){
        Depth = SDepth;
        Radius = SRadius;
    }
    public Plate(float depth, float radius){
        Depth = depth;
        Radius = radius;
    }
    public float getDepth() {
        return Depth;
    }

    public float getRadius() {
        return Radius;
    }

    public void setDepth(float depth) {
        Depth = depth;
    }

    public void setRadius(float radius) {
        Radius = radius;
    }
}

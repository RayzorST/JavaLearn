package lab9;

public class Car implements Nameable, Priceable{
    String Name;
    int Price;

    public static void main(String[] args){
        Car car = new Car("Jetta", 1700000);
        System.out.println("Name: " + car.getName() + " price: " + car.getPrice());
    }

    public Car(String name, int price){
        Name = name;
        Price = price;
    }
    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }
}

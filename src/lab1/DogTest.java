package lab1;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 3);
        Dog dog2 = new Dog("Pop", 18);
        Dog dog3 = new Dog("Ne pop i Rex", 3);
        System.out.println(dog1.toString());
        dog2.setAge(3);
        System.out.println(dog2.getName() + " " + dog2.getAge());
        System.out.println(dog3.getName() + " " + dog3.DogAgeToHuman());
    }
}

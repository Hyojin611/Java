package myClass.compostioin;

public class CompostioinTest {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car mycar = new Car(engine);
        int power = mycar.enginInfo();
        System.out.println("나의 엔진은 " + power + "cc");
    }
}

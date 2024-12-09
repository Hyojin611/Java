package carPackage;

public class Car {
    private String brand;
    private String name;
    private int power;
    private String color;
    private boolean navigation;
    private int speed =0;

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNavigation(boolean navigation) {
        this.navigation = navigation;
    }

    public String getNavigation() {
        if (navigation == true) {
            return "있습니다.";
        }else
            return "없습니다.";

    }

    public void speedUp() {
        if (speed == 0) {
            System.out.println("출발합니다.");
            speed =speed +5;
        } else if (speed > 30) {
            System.out.println("학교 앞 과속입니다.");
            speed = 30;
        } else {
            System.out.println("현재 속도는 " + speed + " 입니다.");
            speed = speed + 5;
        }
    }

    public int speedDown() {
        speed = speed-5;
        return  speed;

    }



    public Car(){

    }


    public Car(String brand, String name, int power) {
        this.brand = brand;
        this.name = name;
        this.power = power;
    }
}

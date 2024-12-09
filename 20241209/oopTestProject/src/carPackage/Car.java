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




    public Car(){

    }


    public Car(String brand, String name, int power) {
        this.brand = brand;
        this.name = name;
        this.power = power;
    }
}

package myClass;

import carPackage.Car;

public class CarMain {
    public static void main(String[] args) {
        Car 현대 = new Car("현대", "그랜져", 2000);
        Car 현대기아 = new Car("현대기아", "k5", 2000);
        Car 삼성 = new Car("삼성", "sm6", 2000);
        현대.setColor("흰색");


        System.out.println(현대.getBrand());
        System.out.println(현대.getColor());

    }
  }

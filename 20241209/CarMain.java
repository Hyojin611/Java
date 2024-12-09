package myClass;

import carPackage.Car;

public class CarMain {
    public static void main(String[] args) {
        Car 현대 = new Car("현대", "그랜져", 2000);
        Car 현대기아 = new Car("현대기아", "k5", 2000);
        Car 삼성 = new Car("삼성", "sm6", 2000);
        현대.setColor("흰색");
        현대.setNavigation(true);
        현대기아.setColor("검정색");
        현대기아.setNavigation(false);
        삼성.setColor("회색");
        삼성.setNavigation(true);


        System.out.println("나의 애마 " + 현대.getName() + "는 " + 현대.getBrand() + "브랜드 " + 현대.getPower() + "cc 입니다.");
        System.out.println("색상은 " + 현대.getColor() + "이고," + "네비게이션은 " + 현대.getNavigation());
        System.out.println("나의 애마 " + 현대기아.getName() + "는 " + 현대기아.getBrand() + "브랜드 " + 현대기아.getPower() + "cc 입니다.");
        System.out.println("색상은 " + 현대기아.getColor() + "이고," + "네비게이션은 " + 현대기아.getNavigation());
        System.out.println("나의 애마 " + 삼성.getName() + "는 " + 삼성.getBrand() + "브랜드 " + 삼성.getPower() + "cc 입니다.");
        System.out.println("색상은 " + 삼성.getColor() + "이고," + "네비게이션은 " + 삼성.getNavigation());

        for (int i = 0; i <= 10; i++) {
            현대.speedUp();
        }
    }
}

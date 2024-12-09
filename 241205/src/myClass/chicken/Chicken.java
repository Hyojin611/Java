package myClass.chicken;

public class Chicken {

    public String chickenBrand;
    public String chickenMenu;
    public int chickenPrice;
    private String model;

    public void modelPrint() {
        System.out.println(this.chickenBrand + "의 모델은 " + this.model + "입니다.");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Chicken() {

    }

    public Chicken(String chickenBrand, String chickenMenu, int chickenPrice) {
        this.chickenBrand = chickenBrand;
        this.chickenMenu = chickenMenu;
        this.chickenPrice = chickenPrice;
        System.out.println(chickenBrand + " " + chickenMenu + "을 " + chickenPrice + "에 주문 했습니다.");
    }
}
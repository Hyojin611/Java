package myClass;

import myClass.chicken.Chicken;

public class ChichkenMain {
    public static void main(String[] args) {
        Chicken 교촌 = new Chicken("교촌","간장치킨",21_000);
        Chicken 비비큐 = new Chicken("비비큐", "황금올리브", 23_000);
        Chicken 자담 = new Chicken("자담치킨", "간장순살치킨", 19_000);
        자담.setModel("권은비");
      //  System.out.println(자담.chickenBrand +" " + "모델은 " + 자담.getModel());
        자담.modelPrint();
    }
}

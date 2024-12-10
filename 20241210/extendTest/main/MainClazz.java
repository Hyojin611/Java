package myClass.extendTest.main;

import myClass.extendTest.CheeseHamburger;
import myClass.extendTest.ChickenBurger;
import myClass.extendTest.Hamburger;

public class MainClazz {
    public static void main(String[] args) {
        Hamburger cheese = new CheeseHamburger();
        System.out.println(cheese.getName());
        System.out.println(cheese.get재료1());
        System.out.println(((CheeseHamburger)cheese).get재료3());
        cheese.order();
        System.out.println("=====================");
        Hamburger chichken = new ChickenBurger();
        System.out.println(chichken.getName());
        chichken.order();
    }
}

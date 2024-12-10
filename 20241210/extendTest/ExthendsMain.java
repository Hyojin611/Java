package myClass.extendTest;

public class ExthendsMain {
    public static void main(String[] args) {
        CheeseHamburger cheeseBurger = new CheeseHamburger();
        System.out.println(cheeseBurger.getName()); //CheeseHamburger 부모꺼
        System.out.println(cheeseBurger.get재료1()); // Hamburger 내꺼
        System.out.println(cheeseBurger.get재료2()); // Hamburger 내꺼
        System.out.println(cheeseBurger.get재료3()); //CheeseHamburger 부모꺼
        System.out.println("=============================================");
        ChickenBurger chickenBurger = new ChickenBurger();
        System.out.println(chickenBurger.getName()); //부모꺼 사용 치킨버거에 getName을 정의 안해놨기때문 / 치킨번거 가서 정의를 해주면 부모께 무시되고 내껄 사용
        System.out.println(chickenBurger.get재료2());
        System.out.println(chickenBurger.get재료3());
        System.out.println("=============================================");

        Hamburger burger = new Hamburger();
        System.out.println(burger.toString());  // 부모께 맘에 안들면 의도적으로 재정의를 해야함.

    }
}




//overriding (오버라이딩)
//부모가 가지고 있는 메서드를 자식이 재 정의했을땐 자식껄 사용 (부모껄 무시)

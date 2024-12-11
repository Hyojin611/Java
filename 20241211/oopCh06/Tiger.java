package oopCh06;

public class Tiger implements AnimalInterface { // exextends 말고 implements 사용
    private String name = "호랑이";

    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("어흥");
    }

    @Override
    public boolean 육식인가() {
        return true;

    }

    @Override
    public String move() {
        return "엄청 빠름";
    }
}

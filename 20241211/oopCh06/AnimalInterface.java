package oopCh06;

public interface AnimalInterface {
    String getName();

    abstract void speak(); //동물의 울음소리 출력 기능   //abstract - 반드시 구현해야하는 것

    boolean 육식인가(); //육식인지 초식인지 확인 : 육식 -true, 초식 -false

    String move();


}



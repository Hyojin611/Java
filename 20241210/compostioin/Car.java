package myClass.compostioin;
//만들어져 있는 엔진을 가져다 사용만 할 거임 // 상속 x compostionin o
public class Car {
    // 생성자 주입 방법
    private final Engine engine;


    public Car(Engine engine) {
        this.engine = engine;
    }

    public int enginInfo() {
        return engine.getPower();
    }
}

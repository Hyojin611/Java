package oopCh05;

//new가 안되는 아이 (abstract)
public abstract class Animal {
    abstract void speak();  //{} 바디가 없어도 됨 어차피 자식들이 구현하면 부모꺼는 사용x 바디 쓰지말라고 의무화해놈
                            //자식들이 의무적으로 구현해야하는 메서드
    public void defence() {
        System.out.println("모든 공격을 차단함");

    }

}

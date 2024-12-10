package myClass;

import myClass.createClass.Dog;

public class DogMain {
    public static void main(String[] args) {
        Dog toto = new Dog();
        System.out.println(toto.type);
        System.out.println(toto.name);
        System.out.println(toto.age);
        System.out.println(toto.color);
        //1년후
        //toot. age - toto.age +1;
        toto.age++;
        toto.color = "노랑색";
        //final 이므로 변경 불가
       // toto.type = "푸들";
        System.out.println("======1년 후");
        System.out.println(toto.color);
        System.out.println(toto.age);
    }
}

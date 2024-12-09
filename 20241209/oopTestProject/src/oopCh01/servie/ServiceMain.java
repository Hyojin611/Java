package oopCh01.servie;

public class ServiceMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add();
        calculator.minus();// 앞에 public이 안붙어 있으면 동일한 패키지 안에서만 보임 (service package안에)

    }
}

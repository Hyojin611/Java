package zzzz;

public class EX3 {
    public static void main(String[] args) {
        //1부터 20까지의 수를 출력
         //단, 2의 배수일떄만 출력

        //1. 2씩 증가해서 출력
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("=============");

        //2. 짝수를 확인해서 출력
        // i % 2 == 0

        for (int i = 1; i <= 20; i++) {
            if ((i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }
}

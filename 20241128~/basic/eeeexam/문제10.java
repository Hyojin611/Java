package basic.eeeexam;

import java.util.Scanner;

public class 문제10 {
    public static void main(String[] args) {
        //입력받은 수의 구구단 출력하기
        Scanner scanner = new Scanner(System.in);
        System.out.println("구하고자 하는 구구단의 수를 입력");

        int D = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(D + "*" + i + "=" + (D * i));

        }
    }
}

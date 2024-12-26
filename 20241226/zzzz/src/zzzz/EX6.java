package zzzz;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        //- 입력(intA, intB) (A > 0, B < 10)

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요 : ");
        int firstNumber = sc.nextInt();

        System.out.println("두번째 수를 입력하세요 : ");
        int secondNumber = sc.nextInt();
        System.out.println("두 수의 합은 : " + (firstNumber + secondNumber));

    }
}

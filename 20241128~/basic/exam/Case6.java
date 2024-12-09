package basic.exam;

import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요 : ");
        int firstNumber = scanner.nextInt();
        System.out.println("두번째 수를 입력하세요 : ");
        int secondNumber = scanner.nextInt();
        System.out.println("두 수의 합은 : " + (firstNumber+ secondNumber));

        // Scanner 객체 닫기 (좋은 습관)
        scanner.close();
    }
}
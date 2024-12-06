package basic.eeeexam;

import java.util.Scanner;

public class 문제6 {
    public static void main(String[] args) {
        //두 정수 A 와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요. :");
        int first = scanner.nextInt();
        System.out.println("두번째 수를 입력하세요. :");
        int second = scanner.nextInt();
        System.out.println("두 수의 합은 : " + (first + second));

        scanner.close();
    }
}

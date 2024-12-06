package basic.exam;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        // 임의의 값 n이 주어지면 예를들어 n=5 : 입력
        Scanner scanner = new Scanner(System.in);
        System.out.println("값을 입력하세요 :");

        // 1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)의 결과를 출력하세요.
        int inputValue = scanner.nextInt();

        //누적할변수
        int sumValue = 0;

        for (int i = 1; i <= inputValue; i++) {
            for (int j = 1; j <= i; j++) {
                sumValue += j;

            }
        }

            System.out.println("결과: " + sumValue);
        }
    }


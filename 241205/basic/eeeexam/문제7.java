package basic.eeeexam;

import java.util.Scanner;

public class 문제7 {
    public static void main(String[] args) {
        // 두 정수 A와 B를 입력받은 다음,
        // 두 수 A와 B 사이의 모든 정수값을 더해 출력하는 프로그램을 작성하시오.

        Scanner scanner = new Scanner(System.in);

        // 두 정수 입력받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        //A 와 B 사이의 모든 정수를 더할 변수
        int sum = 0;
        int start = Math.min(A, B); //작은값
        int end = Math.max(A, B); // 큰 값
        // --작은값부터 큰 값 까지 반복문을 돌리기 위해 범위 설정

        //start 부터 end 까지 반복하면서 값 더하기
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}

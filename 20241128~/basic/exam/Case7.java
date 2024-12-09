package basic.exam;

import java.util.Scanner;

public class Case7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 두 정수 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // A와 B 사이의 모든 정수를 더할 변수
        int sum = 0;
       // 작은 값부터 큰 값까지 반복문을 돌리기 위해 범위 설정
        int start = Math.min(A, B); //작은 값
        int end   = Math.max(A, B); // 큰 값

        //start 부터 and 까지 반복하면서 값 더하기
        for (int i = start; i <=end; i++) {
            sum += i; // i를 sum에 더함
        }

        System.out.println(sum);

        scanner.close();


    }
}

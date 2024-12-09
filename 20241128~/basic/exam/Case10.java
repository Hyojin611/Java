package basic.exam;

import java.util.Scanner;

public class Case10 {
    public static void main(String[] args) {
        //입력받은 구구단 출력하기

        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 구구단의 단수를 입력 : ");

        int N = scanner.nextInt();

        //N에 대해 1부터 9까지 반복하면서 구구단 출력
        for(int i= 1; i <=9; i++){
            System.out.println(N + "*" + i+ " = " + (N * i));
        }
        scanner.close();
    }
}

package xxxx;

import java.util.Scanner;

public class ZZ01 {
    public static void main(String[] args) {
//        int[] data = {9, 8, 2, 4, 3};
//
//        //배열 출력
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        int number = sc.nextInt();

        int[] numbers = {1, 2, 3, 2, 4, 2, 5};

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                count++;
            }
        }
        System.out.println(number + "은" + count + "번 등장합니다.");

        }
    }


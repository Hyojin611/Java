package basic.condition;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in); // Scanner 객체를 생성하여 사용자 입력을 받음
        int n = scanner.nextInt(); // 사용자로부터 점수 입력받기
        n = n / 10;// 점수를 10으로 나누어, 10단위로 구분 ( 예 : 95-> 9 , 88 ->8)
        //switch 문을 사용하여 점수에 맞는 등급 출력
        switch (n) {
            case 10:
                System.out.println("수");
                break;
            case 9:
                System.out.println("수");
                break;
            case 8:
                System.out.println("우");
                break;
            case 7:
                System.out.println("미");
                break;
            case 6:
                System.out.println("양");
                break;
            default:
                System.out.println("가");

        }
    }
}

package basic.eeeexam;

import java.util.Scanner;

public class 문제11switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 시험 성적을 입력 하세요.  ---");

        int s = scanner.nextInt();
        s = s/10;

        switch (s) {
            case 10 :
                System.out.println( " 수 " );
                break;

            case 9 :
                System.out.println( " 수 " );
                break;

            case 8 :
                System.out.println( " 우 " );
                break;

            case 7 :
                System.out.println( " 미 " );
                break;

            case 6 :
                System.out.println( " 양 " );
                break;

            default:
                System.out.println( " 가 " );

        }
    }
}

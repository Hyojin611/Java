package zzzz;

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        //알람시계 문제 45분 일찍 알람 설정하기

        Scanner scanner = new Scanner(System.in);
        System.out.println("시간을 입력하세요. :");
        int H = scanner.nextInt();
        System.out.println("분을 입력하세요.");
        int M = scanner.nextInt();

        M-=45;

        if (M < 0) {
            M += 60;
            H -= 1;
            if (H < 0 ) {
                H = 23;
            }
        }
        System.out.println(H + " " + M);
    }
}

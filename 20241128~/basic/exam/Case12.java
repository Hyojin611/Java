package basic.exam;

import java.util.Scanner;

public class Case12 {
    public static void main(String[] args) {
        // 알람시계 문제
        // 45분 일찍 알람 설정하기
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 시간 입력 : ");
        int hour = scanner.nextInt();
        System.out.println(" 분 입력 : ");
        int minute = scanner.nextInt();

        //1. 분침이 45분이상
            //현재 분침 -45
        //2. 45분 이하
            //현재 시간 -1
            //현재 분 +15분
        //3. 시간 0시이고, 분침이 45분 이하
            // 현재 시간 : 23시
            // 현재 분 +15분

        if (minute >= 45) {
            minute -= 45;
        } else {
            minute= 60 - (45 - minute);
            if (hour == 0) {
                hour = 23;
            } else {
                hour -=1;
            }
        }
        System.out.println(hour+ " " + minute);

        scanner.close();
    }
}

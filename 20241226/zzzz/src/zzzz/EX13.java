package zzzz;

import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        // 오븐시계 문제
        Scanner sc = new Scanner(System.in);

        //입력받기
        System.out.println("현재 시간 :");
        int hour = sc.nextInt();
        System.out.println("현재 분 :");
        int minute = sc.nextInt();
        System.out.println("요리시간 :");
        int time = sc.nextInt();

        //현재시간+ 요리시간 = 전체요리 - > 분으로 표시
        int tatalTime = (hour * 60) + minute + time;
        //출력시간 (총시간을 60분으로 나눈 몫)
        hour = (tatalTime / 60) % 60;
        //출력 분
        minute = tatalTime % 60;
        System.out.println(hour + " " + minute);

    }
}

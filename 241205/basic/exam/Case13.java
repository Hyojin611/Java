package basic.exam;

import java.util.Scanner;

public class Case13 {
    public static void main(String[] args) {
        //오븐시계
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 시간 : ");
        int hour = scanner.nextInt(); // 현재 시
        System.out.println("현재 분 : ");
        int minute = scanner.nextInt(); // 현재 분
        System.out.println("요리 시간 : ");
        int time = scanner.nextInt(); // 요리 시간

        //현지시각+ 요리시간 = 전체 요리 -> 분으로 표시
        int totalTime = (hour * 60) + minute + time;

        //출력시간 (총시간을 60으로 나눈 몫)
         hour = (totalTime / 60)%24;
        //출력 분
         minute = totalTime % 60;
        System.out.println(hour + " " + minute);
        }


    }



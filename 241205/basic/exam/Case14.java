package basic.exam;

import java.util.Scanner;

public class Case14 {
    public static void main(String[] args) {
        //주사위문제
        //1. 같은 눈이 3개가 나오면
        //-- 상금 : 10,000원 + (같은 눈) × 1,000원
        //2. 같은 눈이 2개만 나오는 경우에는
        //-- 상금 : 1,000원 + (같은 눈) × 100원
        //3. 모두 다른 눈이 나오는 경우에는
        //-- 상금 : (그 중 가장 큰 눈) × 100원

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 주사위 값 : ");
        int dice_1 = scanner.nextInt();
        System.out.println("두번째 주사위 값 : ");
        int dice_2 = scanner.nextInt();
        System.out.println("세번째 주사위 값 : ");
        int dice_3 = scanner.nextInt();

        //1. 가장 큰 값 구하기
         int max = 0;
        if (dice_1 > max) max = dice_1;
        if (dice_2 > max) max = dice_2;
        if (dice_3 > max) max = dice_3;
        System.out.println("max = " +max);
        // 몇 개 주사위 값이 같은지 확인
        // 같은 주사위 수 : same
        int same =0;
        // 같은 눈의 수
        int sameNumber = 0;
        if (dice_1==dice_2) {
            same = same +1;
            sameNumber = dice_1;
        }
        if (dice_1==dice_3) same = same +1;
        if (dice_2==dice_3) same = same +1;
        System.out.println("same = " + same);
       // 상금계산
        int result =0;
       switch (same){
           case 3:
               //상금 : 10,000원 + (같은 눈) × 1,000원

               break;
       }
    }


    }

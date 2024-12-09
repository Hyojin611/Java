package review;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        int sum = 0;
        //static 제일 먼저 읽어서 메모리에 넣음 없으면 실행x
        //두 수를 입력받아서 합계를 구하는 프로그램
        //1. 두 수를 스캐너를 통해 입력 받는다.
        //문제점 : 앞 수가 더 큰 경우는 두 수를 바꿔줘야 함.
        //2. 두 수 사이의 값들을 합한다.

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요.");
        int oneNumber = sc.nextInt(); //카멜 케이스 (camelCase) 단어 바뀌면 대문자로 oneNumber 틀린거 찾기 쉬움
        //두번째 수를 입력 받는다.
        System.out.println("두번째 수를 입력하세요.");
        int twoNumber = sc.nextInt();

        //두수를 비교해서 첫번째 값이 크면 두 수를 바꾼다.
        if (oneNumber > twoNumber) {
            int temp = oneNumber;
            oneNumber = twoNumber;
            twoNumber = temp;

        }

        //2. 두 수 사이의 값들을 합한다.
        // for (int i = oneNumber; i <= twoNumber; i++) { // for(int i = 시작값; i 조건; i증감 i++ = i=i+1){
        //   sum = sum +i;
        //}


        while (oneNumber <= twoNumber) {
          sum = sum +oneNumber;
          oneNumber ++;


        }
        System.out.println(sum);
    }
}


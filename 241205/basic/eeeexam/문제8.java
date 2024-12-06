package basic.eeeexam;

import java.util.Scanner;

public class 문제8 {
    public static void main(String[] args) {
        //별찍기
        //*
        //**
        //***

        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 라인 수 입력 : ");

        int line = scanner.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


    }
}

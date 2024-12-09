package basic.eeeexam;

import java.util.Scanner;

public class 문제9 {
    public static void main(String[] args) {
        //별찍기
        //***
        //**
        //*

        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 수 입력");

        int line = scanner.nextInt();

        for (int i = line; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
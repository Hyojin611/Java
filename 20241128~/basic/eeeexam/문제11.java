package basic.eeeexam;

import java.util.Scanner;

public class 문제11 {
    public static void main(String[] args) {
        //조건문 문제 : 시험성적문제
        //시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B,
        //70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

        Scanner scanner = new Scanner(System.in);
        System.out.println("***시험 성적을 입력하세요. ***");
        int score = scanner.nextInt();

        if (score <= 100 && score >= 90) {
            System.out.println(" A ");
        } else if (score>=80 && score < 90) {
            System.out.println(" b ");
        } else if (score>=70 && score < 80){
            System.out.println(" C ");
        } else if (score>=60 && score < 70){
            System.out.println(" D ");
        } else {
            System.out.println("F");
        }
    }
}

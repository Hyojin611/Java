package basic.exam;

import java.util.Scanner;

public class Case11 {
    public static void main(String[] args) {
        //시험 점수 입력받기

        Scanner scanner = new Scanner(System.in);
        System.out.println("**점수를 입력하세요**");
        int score = scanner.nextInt();

        if (score>=90 && score <=100) {
            System.out.println("당신의 결과는 : A");
        } else if (score>=80 && score < 90) {
            System.out.println("당신의 결과는 : B");
        } else if (score>=70 && score <80) {
            System.out.println("당신의 결과는 : C");
        } else if (score >= 60 && score < 70) {
            System.out.println("당신의 결과는 : D");
        } else {
            System.out.println("당신의 결과는 : F");
        }
        scanner.close();
    }
}

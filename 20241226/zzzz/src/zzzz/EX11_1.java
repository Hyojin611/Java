package zzzz;

import java.util.Scanner;

public class EX11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");

        int score = scanner.nextInt();
        score = score / 10;
        switch (score) {

            case 10:
            case 9:{
                System.out.println("A");
                break;
            }
            case 8:{
                System.out.println("B");
                break;
            }
            case 7:{
                System.out.println("C");
                break;
            }
            case 6:{
                System.out.println("D");
                break;

            }
            default:
                System.out.println("F");
        }
    }
}

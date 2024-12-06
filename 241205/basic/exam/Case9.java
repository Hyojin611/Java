package basic.exam;

import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {
        // ***
        // **
        // *

        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 라인수를 입력 : ");

        // 입력받을 줄 수 N
        int line = scanner.nextInt();
        // 1부터 N까지 반복하면서 별을 출력
        for (int i = line; i >0; i++){
            //i번 줄에는 i개의 별을 출력
            for (int j =1; j <=i; j--){
                System.out.print("*");     //println x
            }

            // 한 줄을 출력한 후에는 줄바꿈
            System.out.println();
        }
        scanner.close();
    }
}

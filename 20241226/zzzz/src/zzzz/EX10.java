package zzzz;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + "*" + i + "=" + (dan * i));
        }
    }
}

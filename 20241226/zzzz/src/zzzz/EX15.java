package zzzz;

import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=====================");
            System.out.println("메뉴를 선택하세요 ");
            System.out.println("=====================");
            System.out.println("1. 인사하기");
            System.out.println("2. 춤추기");
            System.out.println("3. 밥먹기");
            System.out.println("4. 종료하기");

            //사용자 입력받기
            int choice = sc.nextInt();

            //선택한 번호에 따른 동작

            if (choice == 1) {
                System.out.println("안녕하세요.");
                break;
            } else if (choice == 2) {
                System.out.println("삐끼삐끼 춤 입니다.");
                break;
            } else if (choice == 3) {
                System.out.println("맛나게 먹었습니다.");
                break;
            } else if (choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");
            }
        }
    }
}

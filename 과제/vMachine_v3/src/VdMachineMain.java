import view.UserView;

import java.util.Scanner;

public class VdMachineMain {
    public static void main(String[] args) {

        UserView view = new UserView();

        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.println("1.회원가입 2.로그인 3.종료");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    view.signupView();
                    break;
                case 2:
                    System.out.println("로그인");
                    view.loginView();
                    break;
                case 3:
                    return;

                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }
    }
}

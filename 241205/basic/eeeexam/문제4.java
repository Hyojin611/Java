package basic.eeeexam;

import java.util.Scanner;

public class 문제4 {
    public static void main(String[] args) {
        //이중 for문

        //임의의 값n이 주어지면 예를들어 n=5이면
        Scanner scanner = new Scanner(System.in);
        System.out.println("값을 입력하세요 : ");

        //1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)의 결과를 출력하세요.

        int n = scanner.nextInt();//Scanner를 이용해 사용자로부터 정수 n을 입력받음 예를 들어, 사용자가 5를 입력하면,n 5가 됨

        //누적할 변수
        int sumValue = 0;

        for (int i = 1; i <= n; i++) {
            //외부 for문은 i가 1부터 n 증가합니다. i의 값은 1, 2, 3, ... , n과 같이 증가합니다.
            //이 i는 각 "구간"을 나타냅니다. 즉, 각 i에 대해 1부터 i까지의 수를 더해가야 합니다.

            for (int j = 1; j <= i; j++) {
                //내부 for문은 j가 1부터 i까지 증가합니다. 즉, i의 값에 맞춰 1부터 i까지의 수를 더하는 반복문입니다.
                //예를 들어, i = 3일 때는 j가 1, 2, 3까지 반복하면서 sumValue에 그 값을 더합니다.

                sumValue += j;
            }
        }
        System.out.println("결과 : " + sumValue);
    }
}

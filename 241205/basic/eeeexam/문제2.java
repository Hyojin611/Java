package basic.eeeexam;

public class 문제2 {
    public static void main(String[] args) {
        //for문
        // 10부터 1까지의 수를 출력하세요.
        for (int i = 10; i >= 1; i--) {
            // 단, 숫자가 3일 때는 출력하지 마세요.
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        //DO~While
        //10부터 1까지의 수를 출력하세요.
        int j = 11;
        do {
            j = j - 1;
            // 단, 숫자가 3일 때는 출력하지 마세요.
            if (j == 3) {
                continue;
            }
            System.out.println(j);
        } while (j > 1 );

    }
}




package basic.eeeexam;

public class 문제1 {
    public static void main(String[] args) {
        //for문
        // 1부터 10까지의 수를 출력하세요.
        for (int i = 1; i <= 10; i++) {
            // 단, 숫자가 6일 때는 출력하지 마세요.
            if (i == 6) {
                continue;
            }
            System.out.println("i = " + i);
        }

        //while문
        // 1부터 10까지의 수를 출력하세요.
        int j = 0;
        while (j < 10) {
            j++;
            // 단, 숫자가 6일 때는 출력하지 마세요.
            if (j == 6) {
                continue;
            }
            System.out.println("j =" + j);
        }
    }
}



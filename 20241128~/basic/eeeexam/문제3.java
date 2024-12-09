package basic.eeeexam;

public class 문제3 {
    public static void main(String[] args) {
        // for문
        // 1부터 20까지의 수를 출력하세요.
        for (int i = 1; i <= 20; i++) {

            // 단, 2의 배수일 때만 출력하세요.
            if (i % 2 == 0) {

                System.out.println(i);
            }
        }
    }
}

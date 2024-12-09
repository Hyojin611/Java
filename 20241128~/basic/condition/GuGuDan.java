package basic.condition;

public class GuGuDan {
    public static void main(String[] args) {
        System.out.println("=== 구구단 === " ); //구구단 제목 출력

        // 첫 for문 : 단을 출력하는 용도 (2단부터 9단까지)
        for (int i = 2; i <= 9; i++) {
            System.out.println("--- " +i + " 단 ---" ); //각 단의 제목 출력

            // 두번째 for문 :각 단마다 곱할 숫자를 출력 (1부터 9까지)
            for (int j =1; j <=9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j)); // 곱셈 결과 출력
            }
        }
    }
}

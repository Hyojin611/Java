package basic.condition;

public class DoLoopTest {
    public static void main(String[] args) {
        // While(조건) --- 하는 동안
        // Do(실행문) ~ While(조건)  (--- 하는 동안)

        // While 구문
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = sum + i;          // sum에 i를 더합니다.
            i = i + 1;              // i를 1씩 증가시킵니다.
            System.out.println(i);  // i 값을 출력합니다.
        }

        //초기화
        i = 1;
        sum = 0;

        //Do-While 구문
        do {
            sum = sum + i;        // sum에 i를 더합니다.
            i = i + 1;            // i를 1씩 증가시킵니다.
        } while (i <= 10);        // i가 10 이하인 동안 반복합니다.

        System.out.println(sum);  // sum을 출력합니다.
    }
}

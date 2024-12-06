package basic.condition;

public class BreakCondition {
    public static void main(String[] args) {
        // 1~10까지 더하기
        // 결과 출력( sum = 55)

        int sum = 0; // 합을 저장할 변수
        for (int i = 1; i <=10; i++) {  //i는 1부터 10까지 반복
            if (i == 5) { //i가 5일때
                continue; //현재 반복을 건너 뛰고 ,i = 5일 떄는 더하지 않음
            }
            sum = sum + i; //i가 5가 아니면 sum에 i를 더함
        }
        System.out.println("sum =" + sum);
    }
}

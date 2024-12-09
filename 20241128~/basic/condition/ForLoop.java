package basic.condition;

public class ForLoop {
    public static void main(String[] args) {
        // 1부터 5까지 더하고 싶어요.
        // 1 + 2 + 3 + 4 + 5
        int value = 0;
        int sumvalue = 0;
        value = value + 1 ;
        sumvalue = sumvalue + value;
        value = value + 1 ;
        sumvalue = sumvalue + value;
        value = value + 1 ;
        sumvalue = sumvalue + value;
        value = value + 1 ;
        sumvalue = sumvalue + value;
        value = value + 1 ;
        sumvalue = sumvalue + value;
        System.out.println(sumvalue); // 첫 번째 합 출력

        sumvalue = 0;
        for (int i =1; i <= 5; i++) { // i는 5부터 시작하여 1씩 감소하면서 반복
            sumvalue =sumvalue + i;
        }
        System.out.println("===" + sumvalue);// 두 번째 합 출력

        //김형민 5번 출력하기
        for (int i = 5; i > 0; i--) {
            System.out.println("김형민");
        }

        //이중 For 구문
        for (int i = 1; i <=5; i++) { // 첫 번쨰 for문 : i가 1부터 5까지 반복
            System.out.println("i = " + i); // i의 값을 출력
            for (int j = 1; j <=5; j++) { // 두 번째 for문 : j가 1부터 5까지 반복
                System.out.println("j =" + j); // j의 값을 출력
            }
        }
    }
}

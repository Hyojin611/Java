package basic.exam;

public class Case3 {
    public static void main(String[] args) {
        //1부터 20까지의 수를 출력하세요.
        //(단 , 2의 배수일떄만 출력하세요.)
        // 방법1.i %2  ==0 (나머지 연산자)
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            // 방법2. 2씩 증가해서 출력
                // for(int i =2; i<=20; i=i+2)
            // 방법3. 짝수를 확인해서 처리하는 방법

            }
        }

    }
}

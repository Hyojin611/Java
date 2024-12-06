package basic.mypagage;

public class OperationEx02 {
    public static void main(String[] args) {
        //1. a에 10을 넣는다.
        int a = 10;
        //2. b에 20을 넣는다.
        long b = 20;
        //3. a와 b를 더해서 출력한다.
        System.out.println(a + b);

        //4. b의 값을 5로 변경
        b = 5;
        //5.a와 b를 곱해서 출력
       long x = a * b;
       System.out.println("a*b = " + x);

       // a ÷ b = 결과를 result에 담아서 출력
        double result = (double) a / b;     // a를 double로 형변환하고 나누기 연산
        System.out.println("a / b= " + result);
        //6. numberA = 3 numberB = 7 3을 7로 나눈 나머지를 구하고 결과를 answer에 담아서 출력
        int numberA = 3;
        int numberB = 7;
        int answer = numberA % numberB;

        System.out.println(numberA + "을 " + numberB + "로 나눈 나머지는?" + answer +  "입니다.");


    }
}

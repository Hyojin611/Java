package basic.condition;

public class CompareNumber {
    public static void main(String[] args) {

        int intA = 7;  // intA는 7로 초기화
        int intB = 4;  // intB는 4로 초기화
        String testString = "";  // 사용되지 않는 변수
        int temp; // 임시 변수 ( 값 교환을 위한 용도)

        String result = "intA = " + intA + " intB = " + intB;  // intA = 7 , intB = 4
        System.out.println(result);   // intA = 7 , intB = 4 출력

        //  intA 와 intB를 비교
        if (intA > intB) {  // intA가 intB보다 크면
            temp = intA;    // temp에 intA 값 저장
            intA = intB;    // intA에 intB 값을 할당
            intB = temp;    // intB에 temp(원래의 intA 값) 값을 할당
        }

        // 값이 교환 된 후 출력
            result = "intA = " + intA + " intB = " + intB;
            System.out.println(result);

        }


    }

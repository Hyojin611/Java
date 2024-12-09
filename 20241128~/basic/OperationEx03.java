package basic;

public class OperationEx03 {
    public static void main(String[] args) {
        // 대입 (뒤에 값을 앞의 변수에 넣어주세요)
        int a = 3;
        System.out.println( 1 == 1);
        System.out.println( 1 != 1);
        System.out.println( 2 >= 1);
        //논리연산자
        // and : && , or : || , not : !
        // 3 < 4 < 5
        System.out.println(3<4 && 4<5);
        // 성적을 국어점수(kor) 라는 변수에 담아요 -- 51
        // 영어점수(eng) -- 80
        // 조건1. 두 점수 중 한가지만 60이상이면 합격
        // 조건1 결과 : 합격


        // 조건2. 두 점수 모두 60점 넘으면 합격
        // 조건2 결과 : 불합격

    }
}

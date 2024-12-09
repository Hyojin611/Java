package basic.condition;

public class IfCondition {
    public static void main(String[] args) {
        //if(조건) {
        //   참일때 실행할 문장}
        // else {
        //    거짓일 때 실행할 문자 }

        // 조건 판단문 : if
        // 1. 점수 60점 이상 : 합격, 불합격
        int score = 100; // 점수를 100으로 설정

        // 첫번째 조건문 : 점수 60점 이상이면 합격, 아니면 불합격
        if(score >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        //두번째 조건문 : 점수에 따른 등급을 출력
        if(score >= 90){
            System.out.println("수");  // 90점 이상이면 '수'
        } else if (score >= 80){
            System.out.println("우");  // 80점 이상 90점 미만이면 '우'
        } else if (score >=70) {
            System.out.println("미");  // 70점 이상 80점 미만이면 '미'
        } else if (score >=60) {
            System.out.println("양");  // 60점 이상 70점 미만이면 '양'
        } else {
            System.out.println("가");  // 60점 미만이면 '가'
        }
    }
}

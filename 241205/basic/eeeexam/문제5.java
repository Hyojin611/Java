package basic.eeeexam;

public class 문제5 {
    public static void main(String[] args) {
        //money 변수 3780원의 금액이 있습니다.
        //이를 다음과 같은 결과가 나오도록 출력합니다.
        //1000원 : 3개
        //남은금액 : 780원
        //500원 : 1개
        //남은금액 : 280원
        //100원 : 2개
        //남은금액 : 80원
        //10원 : 8개
        //남은금액 : 0원

        int money = 3_780;

        //1000원
        System.out.println("1000원 : " + (money / 1000) + "개");
        money = money % 1000;
        System.out.println("남은금액 : " + money + "원");

        //500원
        System.out.println("500원 : " + (money / 500) + "개");
        money = money % 500;
        System.out.println("남은금액 : " + money + "원");

        //100원
        System.out.println("100원 : " + (money / 100) + "개");
        money = money % 100;
        System.out.println("남은금액 : " + money + "원");

        //10원
        System.out.println("10원 : " + (money / 10) + "개");
        money = money % 10;
        System.out.println("남은금액 : " + money + "원");

    }
}

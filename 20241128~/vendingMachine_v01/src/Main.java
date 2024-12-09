import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc =new Scanner(System.in);
    static String[] product = new String[5]; //제품명
    static int[] price = new int[5];//가격
    static int[] stock = new int[5];//재고수량
    static int uesrMoney = 0;

    //전체 수익금액을 관리하는 변수
    static int totalMoney = 0;



    public static void main(String[] args) {
        initialize();
        uesr();
        printlist();
    }

    private static void printlist() {
        for (int i = 0; i < product.length; i++) {
            if (product[i]==null) {
                continue;
            }
            System.out.printf((i + 1)+"." + product[i]+"("+price[i]+"W"+")"+"-"+stock[i]+"개 ");
            //1.콜라(500W)-3개
        }
    }

    private static void uesr() {
        // 사용자가 입력한 돈을 잠시 저장하는 변수

        while(true) {
            showTitle();
            System.out.println("돈을 넣어주세요 : ");
            uesrMoney = sc.nextInt();
            int number = 0;
            System.out.println("메뉴 입력");
            number = sc.nextInt();
            //사용자가 선택한 제품을 조건에 따라 제공하는 기능
            //제공할 제품의 금액과 입력할 금액을 비교
            if (price[number - 1] <= uesrMoney) {
                System.out.println(product[number - 1] + " 이(가) 나왔다.");
                uesrMoney = uesrMoney - price[number - 1];
                System.out.println("잔액 : " + uesrMoney);
                selectMenu();
            } else {
                selectMenu();
            }
        }
    }

    private static void selectMenu() {
        int selectNumber = 0;
        System.out.println("1:계속구매하기 2:금액추가하기 3:잔돈반환하기");
        while (true) {
            System.out.println("메뉴입력 : ");
            selectNumber = sc.nextInt();
            switch (selectNumber) {
                case 1: // 계속 구매하기
                    System.out.println("계속 구매 작업");
                    break;
                case 2: // 금액 추가
                    System.out.println("금액 추가");
                    break;
                case 3: // 잔돈 반환
                    System.out.println("거스름 돈 " + uesrMoney );
                    break;
                default:
                    System.out.println("입력 오류");
                    break;
            }
        }
            }

    private static void showTitle() {
        System.out.println("==================================================");
        System.out.println("자판기입니다.(번호:상품(가격)-재고)");
        printlist();
        System.out.println();
        System.out.println("==================================================");
    }

    private static void initialize() {
        //콜라정보
        product[0] = "콜라";
        price[0] = 500;
        stock[0] = 3;

        //사이다정보
        product[1] = "사이다";
        price[1] = 700;
        stock[1] = 3;

        //커피정보
        product[2] = "커피";
        price[2] = 1500;
        stock[2] = 3;
    }
}
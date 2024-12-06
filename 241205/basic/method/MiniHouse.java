package basic.method;

public class MiniHouse {
    // 두 수를 바꾸는 메서드를 static으로 만들어서 처리
    static int a = 3;
    static int b = 4;

    public static void main(String[] args) {
     //   JunyongStore.printTitle("이거 찍어줘");
        JunyongStore jun = new JunyongStore();
        jun.printTitle("오늘을 지하철 파업");

        // 바꾸기 전
        String data = "a=" + a + ",b=" + b;
        jun.printTitle(data);
         //두 수를 바꾸는 메서드를 호출
        swapData();
        data = "a=" + a + ",b=" + b;
        jun.printTitle(data);
    }

    private static void swapData() {
        int temp =a;
        a = b;
        b = temp;
    }

}

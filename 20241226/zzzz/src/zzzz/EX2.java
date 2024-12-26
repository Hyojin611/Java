package zzzz;

public class EX2 {
    public static void main(String[] args) {
        //10 부터 1까지 출력
        // 3일때 출력 제외

        for (int i = 10; i >=1; i--) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        int j = 11;
        while (j > 1) {
            j--;
            if (j == 3) {
                continue;
            }
            System.out.println(j);
        }
    }
}

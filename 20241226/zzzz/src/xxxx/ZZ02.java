package xxxx;

import java.util.Arrays;

public class ZZ02 {
    public static void main(String[] args) {
        int[] data = {9, 8, 2, 4, 3};

        //값의 바뀜 유무를 확인하는 아이
        boolean flag = false;
        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            } else {
                System.out.println(i + "단계 : " + Arrays.toString(data));
                flag = false;
            }
        }
    }
}

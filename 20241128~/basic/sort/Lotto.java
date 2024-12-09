package basic.sort;

import java.util.Arrays;

public class Lotto {
    static void lotto(int[] a) {
        int count = 0;
        int num = 0;
        while (count < 6) {
            num = (int) (Math.random() * 45) + 1;
            // 중복번호인지 확인
            boolean flag = false;
            for (int i = 0; i < count; i++) {
                if (a[i] == num) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                a[count] = num;
                count++;
            }
        }

        //return a;
    }

    public static void main(String[] args) {
        int[] lottoNumber = new int[6];
        int[] myNumber = new int[6];

//        while (count < 6) {
//            num = (int) (Math.random() * 45) + 1;
//            // 중복번호인지 확인
//            boolean flag = false;
//            for (int i = 0; i < count; i++) {
//                if (lottoNumber[i] == num) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag == false) {
//                lottoNumber[count] = num;
//                count ++;

        lotto(myNumber);
        lotto(lottoNumber);
        System.out.println("내 당첨번호 : " + Arrays.toString(myNumber));
        System.out.println("로또 당첨번호 : " + Arrays.toString(lottoNumber));
        int same = 0;

        //밖에 for는 내 번호를 하나씩 읽어서 비교하는 용도
        for (int i = 0; i < myNumber.length; i++) {
            //당첨 번호를 무조건 다 읽어서 맞는지 확인
            for (int j = 0; j < lottoNumber.length; j++) {
                if (myNumber[i]==lottoNumber[j]) {
                    same++;
                }
            }
        }
        System.out.println(same);
    }

}


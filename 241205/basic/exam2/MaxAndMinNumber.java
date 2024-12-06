package basic.exam2;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        //최대 값과 인덱스 찾기
        //9개의 서로 다른 자연수
        //3, 29, 38, 12, 57, 74, 40, 85, 61
        //이들 중 최대값을 찾고 그 최댓값이 몇번째 수인지 작성하시오.
        int[] numbers = {3, 29, 38, 12, 57, 74, 40, 85, 61};

        int min = 99999999;
        int minIndex = 0;
        int max = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            System.out.println("최댓값 : " + max + ",인덱스 : : " + maxIndex);
            System.out.println("최솟값 : " + min + ",인덱스 : : " + minIndex);
        }
    }
}


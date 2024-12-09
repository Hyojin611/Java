package basic.exam;

public class Case2 {
    public static void main(String[] args) {
        // 10부터 1까지의 수를 출력하세요.
        // 단, 숫자 3일 및 출력하지 마세요.
        // for 와 do~while 문을 두 단어로 사용하여 만들어 보세요.
        for (int i = 10; i >= 1; i-- ) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        int i = 10;

        do {
            if( i == 3) {
                i--;
                continue;
            }
            System.out.println(i);
            i--;
        } while (i>=1);


        }
    }


package Greedy;

import java.util.Scanner;

public class multiple_or_plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = str.toCharArray();

        int result = Character.getNumericValue(chars[0]);
        // result = chars[0] - '0' // 아스키코드값을 빼줘서 계산해줘도 된다.

        for (int i=1;i<chars.length;i++) {
            int i_th_num = Character.getNumericValue(chars[i]);
            if (result >= 2 && i_th_num >= 2) {
                result *= i_th_num;
            }
            else result += i_th_num;
        }
        System.out.println(result);


    }
}

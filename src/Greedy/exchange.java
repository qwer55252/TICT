package Greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_money = scanner.nextInt();
        ArrayList<Integer> cnt = new ArrayList(); // 각 화폐(내림차순)를 몇 개씩 주는지 저장하는 배열
        Integer[] moneys = {500, 100, 50, 10}; // 화폐 단위 배열
        int tmp = input_money;
        int sum = 0;
        for (int money : moneys) {
            cnt.add(tmp/money);
            sum += tmp/money;
            tmp = tmp % money;
        }
        System.out.println(cnt);
        System.out.println("최소 동전의 개수 : " + sum);
    }
}

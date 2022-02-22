package Greedy;

import java.util.Scanner;

public class until_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int result = 0;

        while (true) {
            int target = (N / K ) * K;
            result += (N - target);
            N = target;

            if (N < K) break;
            result += 1;
            N = N / K;
        }
        System.out.println(result);
    }
}

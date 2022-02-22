package Greedy;

import java.io.CharArrayReader;
import java.util.*;


//// <내 코드>
//public class adventurers_guild {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//
//        /*ArrayList<Integer> arr = new ArrayList<Integer>();
//        for (int i=0;i<5;i++) {
//            arr.add(scanner.nextInt());
//        }*/
//
//        int[] arr = new int[N];
//        for (int i=0;i<N;i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(arr);
//        //int fear;
//        int result=0;
//        int cnt=0;
//        for (int fear : arr) {
//            //fear = arr[i];
//            cnt++;
//            if (cnt == fear) {
//                result++;
//                cnt=0;
//            }
//        }
//
//        System.out.println(result);
//    }
//}

// <답안 참고 코드>
public class adventurers_guild {
    public static int N;
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (int i=0;i<N;i++) {
            arrayList.add(scanner.nextInt());
        }
        Collections.sort(arrayList);

        int result=0;
        int cnt=0;
        for (int fear : arrayList) {
            cnt++;
            if (cnt >= fear ) {
                result++;
                cnt=0;
            }
        }
        System.out.println(result);
    }
}

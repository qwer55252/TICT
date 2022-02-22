package Implementation;

import java.text.CharacterIterator;
import java.util.*;

public class up_down_left_right {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] directs = scanner.nextLine().split(" ");

        //              상 하 좌 우
        Integer[] dx = {-1, 1, 0, 0};
        Integer[] dy = {0, 0, -1, 1};

        int x = 1;
        int y = 1;

        for (String direct : directs) {
            if (direct.equals("U")) {
                x += dx[0];
                y += dy[0];
            }
            else if (direct.equals("D")) {
                x += dx[1];
                y += dy[1];
            }
            else if (direct.equals("L")) {
                x += dx[2];
                y += dy[2];
            }
            else if (direct.equals("R")) {
                x += dx[3];
                y += dy[3];
            }
            else {
                System.out.println("해당 명령어는 존재하지 않습니다.");
            }
            if (x > N) x = N;
            if (x < 1) x = 1;
            if (y > N) y = N;
            if (y < 1) y = 1;
        }

        System.out.println(x + " "+y);


    }
}

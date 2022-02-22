package BFS_DFS;

public class recursive_function {
    public static void main(String[] args) {
        rf(1);
    }

    public static void rf(int i) {
        // 100번째 호출을 했을 때 종료되도록 종료 조건 명시
        if (i == 100) return;
        System.out.println(i + "번째 재귀함수에서" + (i+1) + "번째 재귀함수를 호출합니다.");
        rf(i+1);
        System.out.println(i + "번째 재귀함수를 종료합니다.");
    }

}

package BFS_DFS;



public class euclidean_algorithm {
    public static void main(String[] args) {
        System.out.println(gcd(192,162));
    }
    public static int gcd(int n, int m) { // n > m
        if (n % m == 0) return m;
        else return gcd(m, n % m);
    }
}

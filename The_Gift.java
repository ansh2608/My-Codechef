import java.util.Scanner;

public class The_Gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (X + M >= N) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

import java.util.Scanner;

public class Chef_And_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a < b) System.out.println("<");
            if(a > b) System.out.println(">");
            if(a == b) System.out.println("=");
        }
    }
}

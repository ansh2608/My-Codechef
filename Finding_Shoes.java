import java.util.Scanner;

public class Finding_Shoes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if (m>=n) System.out.println(n);
            else System.out.println((n-m)+n);
        }
    }
}

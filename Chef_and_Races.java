import java.util.Scanner;

public class Chef_and_Races {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=2;
            if (x==a || x==b) count--;
            if (y==a || y==b) count--;
            System.out.println(count);
        }
    }
}

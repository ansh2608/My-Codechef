import java.util.Scanner;

public class Donation_Drive {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x-y);
        }
    }
}

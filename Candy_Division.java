import java.util.Scanner;

public class Candy_Division {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            System.out.println((n%3==0)?"YES":"NO");
        }
    }
}

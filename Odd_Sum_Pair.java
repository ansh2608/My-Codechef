import java.util.Scanner;

public class Odd_Sum_Pair {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x  = sc.nextInt();
            int y  = sc.nextInt();
            int z  = sc.nextInt();
            if((x+y)%2==1 || (y+z)%2==1 || (x+z)%2==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

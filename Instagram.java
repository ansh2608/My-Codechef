import java.util.*;
public class Instagram {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y*10) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}

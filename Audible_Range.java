import java.util.Scanner;

public class Audible_Range {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        int n;
        while(t-->0){
            n=inp.nextInt();
            if(n>=67 && n<=45000) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

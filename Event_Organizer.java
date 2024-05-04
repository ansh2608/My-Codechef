import java.util.*;

public class Event_Organizer {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            int n=in.nextInt();
            int[][] orders=new int[n][3];
            for(int i=0;i<n;i++) {
                orders[i][0]=in.nextInt();
                orders[i][1]=in.nextInt();
                orders[i][2]=in.nextInt();
            }
            int result=maxCompensation(orders);
            System.out.println(result);
        }
    }
    public static int maxCompensation(int[][] orders) {
        Arrays.sort(orders,(a, b) -> Integer.compare(a[1],b[1]));
        int n=orders.length;
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++) {
            dp[i]=Math.max(dp[i-1],orders[i-1][2]);
            for(int j=i-1;j>0;j--) {
                if(orders[i-1][0]>=orders[j-1][1]) {
                    dp[i]=Math.max(dp[i],dp[j]+orders[i-1][2]);
                    break;
                }
            }
        }
        return dp[n];
    }
}
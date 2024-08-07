import java.util.Scanner;

public class World_Chess_Championship {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int X = sc.nextInt();
            String matchString = sc.next();
            int carlsenCount = 0;
            int chefCount = 0;
            for(int j=0; j<matchString.length(); j++) {
                if(matchString.charAt(j) == 'C') carlsenCount+=2;
                else if (matchString.charAt(j) == 'N') chefCount+=2;
                else {
                    carlsenCount += 1;
                    chefCount += 1;
                }
            }
            if(carlsenCount > chefCount) System.out.println(X * 60);
            else if(carlsenCount == chefCount) System.out.println(X * 55);
            else if(carlsenCount < chefCount) System.out.println(X * 40);
        }
    }
}

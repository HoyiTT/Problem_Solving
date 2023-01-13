import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();

    int[] dp = new int[k];
    int[] st = new int[k];

    for(int a = 0; a < k; a++){
      st[a] = scanner.nextInt();
    }
    dp[0] = st[0];
    int max = st[0];
    
    
    for(int c = 1; c < k;c++){
      //System.out.println(" 1 : " + (dp[c - 1] + st[c]) );
      //System.out.println(" 2 : " + st[c]);
      dp[c] = Math.max(dp[c - 1] + st[c], st[c]);
      //System.out.println(" dp[c] : " + dp  [c]);
      max = Math.max(max,dp[c]);

      //System.out.println("Max : " + max);
      
    }
    
    System.out.println(max);
    
    scanner.close();
  }
}
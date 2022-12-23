import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    for (int num = 0; num < k; num++){
      int a = scanner.nextInt();
      int[] dp = new int[11];
      dp[0] = 1;
      dp[1] = 2;
      dp[2] = 4;
    
      for (int n = 3 ; n < a; n++){
        dp[n] = dp[n - 3] + dp[n - 2] + dp[n -1];
      }
      System.out.println(dp[a - 1]);
    }
    
    scanner.close();
  }
}
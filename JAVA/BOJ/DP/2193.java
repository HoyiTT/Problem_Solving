import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    long[] dp = new long [k+1];

    if(k <= 2 ){
      System.out.println(1);
    } else {
      dp[1] = 1;
      dp[2] = 1;
        for (int a = 3; a <= k; a++){
          dp[a] = dp[a-1] + dp[a-2];
        }
      System.out.println(dp[k]);
      }
    
    scanner.close();
  }
}
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    scanner.nextLine();

    int[] dt = new int[k];
    int[] dp = new int[k + 1];

    for(int a = 0; a < k; a++){
      dt[a] = scanner.nextInt();
    }

    dp[1] = dt[0];

    if(k == 1){
      System.out.println(dp[k]);
      return;
    }

    dp[2] = dp[1] + dt[1];

    if(k == 2){
      System.out.println(dp[k]);
      return;
    }
    
    for(int b = 3; b <= k; b++){
      dp[b] = dp[b - 3] + dt[b - 2] + dt[b - 1];
      dp[b] = Math.max(dp[b], dp[b - 2]  +dt[b - 1]);
      dp[b] = Math.max(dp[b], dp[b - 1]);
    }

    System.out.println(dp[k]);
    
    
    
    scanner.close();
  }
}
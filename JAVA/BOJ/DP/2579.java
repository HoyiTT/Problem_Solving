import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();

    int[] seq = new int[k + 1];
    int[] dp = new int[k + 1];

    for(int a = 1; a <= k; a++){
      seq[a] = scanner.nextInt();
    }
    dp[1] = seq[1];
    
    if (k >= 2) {
			dp[2] = seq[1] + seq[2];
		}
 
		for (int i = 3; i <= k; i++) {
			dp[i] = Math.max(dp[i - 2] , dp[i - 3] + seq[i - 1]) + seq[i];
		}
 
		System.out.println(dp[k]);
    
    scanner.close();
  }
}
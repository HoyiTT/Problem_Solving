import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();

    int [] dp = new int[k];
    int [] dt = new int[k];

    for(int a = 0; a < k; a++){
      dt[a] = scanner.nextInt();
    }

    
    
    for(int b = 0;b < k;b++){
      dp[b] = 1;
      
      for(int c = 0; c < k;c++){

        if(dt[c] < dt[b] && dp[b] < dp[c] + 1){
          dp[b] = dp[c] + 1;
        }
      }
    }

    
   	int max = -1;
		for(int i = 0; i < k; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
    
		System.out.println(max);
    
    
    scanner.close();
  }
}
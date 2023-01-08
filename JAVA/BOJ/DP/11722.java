import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();

    int [] seq = new int[k];
    int [] dp = new int[k];

    for(int a = 0; a < k; a++){
      seq[a] = scanner.nextInt();
    }

    dp[0] = 1;
    int r = dp[0];
    
    for(int b = 1;b < k;++b){
      dp[b] = 1;
      //dp모든 값의 최소값은 1이다.
      for(int c = 0; c < b;++c){
        if(seq[b] < seq[c] && dp[b] < dp[c] + 1){
          dp[b] = dp[c] + 1;
        }
        //b값이 c보다 작고 dp[b]가 dp[c] + 1보다 작을 경우 dp[b]에 dp[c] + 1을 대입
      }
    r = Math.max(dp[b],r);
    }
    System.out.println(r);
    scanner.close();
  }
}
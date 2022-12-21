import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    int[] dp = new int[k + 1];

    dp[1] = 0;

    for(int i = 2; i<= k; i++){
      dp[i] = dp[i -1] + 1;
      if(i % 2 == 0 ){
        dp[i] = Math.min(dp[i], dp[i/2] + 1);
      }
      if(i % 3 == 0){
        dp[i] = Math.min(dp[i], dp[i/3] + 1);
      }
    }
    /*dp = [0,1,1,2,3,2,... ] i는 횟수가 아닌 각 정수의 최소 결과값을 의미한다.*/ 
    System.out.println(dp[k]);
    scanner.close();
  }
}
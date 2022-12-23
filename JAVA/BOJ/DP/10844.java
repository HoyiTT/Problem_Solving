import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    
    long[][] dp = new long[k + 1][10];
    
    for(int i = 1; i < 10;i++){
      dp[1][i] = 1;
    }

    long an = 1000000000;
    
    for(int f = 2 ; f <= k; f++){
      for(int a = 0;a < 10; a++){
        if (a == 0){
          dp[f][a] = dp[f-1][1] % an;
        } else if(a == 9){
          dp[f][a] =dp[f-1][8] % an;
        } else{
          dp[f][a] = (dp[f-1][a-1] + dp[f-1][a+1]) % an;
        }
      }
    }
    
    long result= 0;
    
    for(int sum = 0; sum<10;sum++){
      result = (result + dp[k][sum]) % an;
     }
    
    System.out.println(result);
    
    scanner.close();
  }
}
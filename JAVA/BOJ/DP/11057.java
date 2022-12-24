import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();

    int mod = 10007;
    
    int[][] dp = new int[k + 1][10];
    dp[0][0] = 1;

    for (int row = 1; row <= k; row++){
      for (int col = 0; col < 10; col++){
        for (int preCol = 0; preCol < 10; preCol++){
          if(preCol <= col){
            dp[row][col] += dp[row - 1][preCol];
          }
        }
        dp[row][col] %= mod;
      }
    }
    
    
    int result= 0;

    // for(int a= 0;a<=k;a++){
    //   for(int b =0;b<10;b++){
    //     System.out.print(dp[a][b]+ " ");
    //   }
    //   System.out.println();
    // }
    
    for(int sum = 0; sum<10;sum++){
      result = (result + dp[k][sum]) % mod;
     }
    
    System.out.println(result);
    
    scanner.close();
  }
}
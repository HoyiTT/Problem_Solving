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

    dp[0] = 1;
    int r = dp[0];
    
    for(int b = 1;b < k;++b){
      //System.out.print ("b" + b + " ");
      for(int c = 0; c < b;++c){
        // System.out.print ("c" + c + " ");
        if(dt[c] > dt[b]){
          //System.out.print (dp[b]+ " " + dp[c] );
          dp[b] = Math.max(dp[b],dp[c]);
        }
      }
      dp[b] += 1;
      r = Math.max(r,dp[b]);;
      
    }
    
		System.out.println(r);
    
    
    scanner.close();
  }
}
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    
    for (int b = 0; b < (2 * k - 1 ); b++){
      //(2*n-1)개의 줄을 구분하는 for문
      if ( b >= 0 && b < (2 * k - 1) / 2){
        // 1 ~  (2 * k -1) / 2 까지의 줄을 출력하기 위해 사용하는 if문
        for (int d = 0; d < 2 * k; d++){
          if(d < b+1 || d >= 2 * k - (b + 1)){
            System.out.print("*");
          } else{
            System.out.print(" ");
          }
        } System.out.println();
      } else if(b == (2 * k - 1) / 2){
        // (2 * k -1)줄을 출력하기 위해 사용하는 if문
        for (int c = 0; c < 2 * k; c++){
          System.out.print("*");
        }
        System.out.println();
      } else {
        // (2 * k -1) / 2  ~ k까지의 줄을 출력하기 위해 사용하는 if문
        for (int d = 0; d < 2 * k; d++){
          if(d < (2 * k) - (b + 1) || b < d){
            System.out.print("*");
          } else{
            System.out.print(" ");
          }
        } System.out.println();
      }
    }
    scanner.close();
  }
}
// 굉장히 어렵다..
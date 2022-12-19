import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    
    for (int b = 0; b < (2 * k - 1 ); b++){
      //(2*n-1)개의 줄을 구분하는 for문
      if ( b < k ){
        // 1 ~  (2 * k -1) / 2 까지의 줄을 출력하기 위해 사용하는 if문
        for (int d = 0; d < k; d++){
          if(d < k - b -1){
            System.out.print(" ");
          } else{
            System.out.print("*");
          }
        } System.out.println();
      } else {
        for (int d = 0; d < k; d++){
          if((b - (k - 1) - 1 >= d)){
            System.out.print(" ");
          } else{
            System.out.print("*");
          }
        } System.out.println();
      }
      
      scanner.close();
    }
  }
}
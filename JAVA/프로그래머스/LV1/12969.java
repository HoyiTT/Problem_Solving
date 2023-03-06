import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int num1 = 0;num1 < b;num1++){
            
            for(int num2 = 0; num2 < a;num2++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
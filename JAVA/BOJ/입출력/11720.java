import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        
        String na = scanner.next();
        int result = 0;
        
        for (int a = 0; a < k; a++){
            result += na.charAt(a)-'0';  
        }
        
        System.out.print(result);
    }
}


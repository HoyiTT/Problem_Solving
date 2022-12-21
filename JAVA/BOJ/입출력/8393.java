import java.util.*;

public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        
        int result = 0;
        
        for(int a = 0; a < k; a++){
            result += (a + 1);  
        }
        System.out.println(result);
    }

}

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        
        for(int a = 0; a < num.length();a++){
            answer += Integer.parseInt(num.substring(a,a+1));
        }

        return answer;
    }
}
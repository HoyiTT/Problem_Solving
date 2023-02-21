import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String num = Long.toString(n);
        String[] arr = num.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        num = String.join("",arr);
        answer = Long.parseLong(num);
        
        return answer;
    }
}
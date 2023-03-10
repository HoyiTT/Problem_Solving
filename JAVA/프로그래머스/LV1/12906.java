import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        int num = -1;
        for(int a = 0; a < arr.length;a++){
            if(arr[a] != num){
                arrList.add(arr[a]);
                num = arr[a];
            }
        }
        
        answer = new int[arrList.size()];
        for(int b = 0; b < answer.length;b++){
            answer[b] = arrList.get(b);
        }
        
        return answer;
    }
}
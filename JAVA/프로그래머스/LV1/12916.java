class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] str = s.split("");
        
        int pCount = 0;
        int yCount = 0;
        
        for(int a = 0; a < s.length();a++){
            if(str[a].equals("p") || str[a].equals("P"))pCount++;
            if(str[a].equals("y") || str[a].equals("Y"))yCount++;
        }

        if(pCount != yCount) answer = false;

        
        return answer;
    }
}
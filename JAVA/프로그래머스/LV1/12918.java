class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        for(int a = 0; a < s.length(); a++){
            if(s.charAt(a) < '0' || s.charAt(a) > '9') return false;
            } 
        return true;
    }
}
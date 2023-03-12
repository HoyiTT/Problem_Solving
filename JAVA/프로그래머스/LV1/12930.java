class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        int idx = 0;
        for(int a = 0; a < str.length;a++){
            if(str[a].equals(" ")){
                idx = 0;
            }
            else if(idx % 2 == 0){
                str[a] = str[a].toUpperCase();
                idx++;
            }else if(idx % 2 != 0){
                str[a] = str[a].toLowerCase();
                idx++;
            }
            answer += str[a];
        }
        return answer;
    }
}
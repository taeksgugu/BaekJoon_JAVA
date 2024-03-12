class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for (int[] lst: queries) {
            int a = lst[0];
            int b = lst[1];
            String new1 = answer.substring(0,a);
            String new2 = answer.substring(a,b+1);
            String new3 = answer.substring(b+1,answer.length());
            StringBuffer sb = new StringBuffer(new2);
            String reverse = sb.reverse().toString();
            answer = new1 + reverse + new3;
        }
        return answer;
    }
}
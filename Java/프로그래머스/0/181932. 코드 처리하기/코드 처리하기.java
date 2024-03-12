class Solution {
    public String solution(String code) {
        int mode = 0;
		String answer = "";
		for (int i=0; i<code.length();i++) {
			if (mode==0) {
				if (code.charAt(i) != '1' && i%2==0) {
					answer += String.valueOf(code.charAt(i));
				} else if (code.charAt(i) == '1') {
					mode = 1;
				}
			} else {
				if (code.charAt(i) != '1' && i%2==1) {
					answer += String.valueOf(code.charAt(i));
				} else if (code.charAt(i) == '1') {
					mode = 0;
				}
			}
		}
        
        if (answer.length() == 0) {
            answer = "EMPTY";
        }
		return answer;
    }
}
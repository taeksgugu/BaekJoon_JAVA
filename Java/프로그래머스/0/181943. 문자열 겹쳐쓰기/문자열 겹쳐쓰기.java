class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] lst = my_string.toCharArray();
		for (int i = s; i<s+overwrite_string.length(); i++) {
			lst[i] = overwrite_string.charAt(i-s);
		}
		
		String answer = String.valueOf(lst);
        return answer;
    }
}
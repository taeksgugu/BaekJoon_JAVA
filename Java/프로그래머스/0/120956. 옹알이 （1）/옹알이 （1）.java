class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
		for (String bab: babbling) {
			String str = bab.replaceAll("aya|ye|woo|ma", "");
			if (str.equals("")) answer ++;
		}
		
        return answer;
    }
}
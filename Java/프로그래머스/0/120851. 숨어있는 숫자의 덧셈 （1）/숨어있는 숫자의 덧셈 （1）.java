class Solution {
    public int solution(String my_string) {
		String[] lst = my_string.replaceAll("[a-zA-Z]","").split("");
		int answer = 0;
		for (String s: lst) {
			answer += Integer.parseInt(s);
		}
        return answer;
    }
}
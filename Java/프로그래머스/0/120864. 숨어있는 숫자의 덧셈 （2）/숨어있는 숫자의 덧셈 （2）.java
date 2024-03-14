class Solution {
    public int solution(String my_string) {
        String[] lst = my_string.split("[a-zA-Z]+");
		int answer = 0;
		for (String s: lst) {
			if (!s.equals("")) {
				answer += Integer.parseInt(s);
			}
		}
        return answer;
    }
}
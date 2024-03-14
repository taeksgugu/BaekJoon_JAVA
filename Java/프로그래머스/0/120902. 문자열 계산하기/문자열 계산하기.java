class Solution {
    public int solution(String my_string) {
        String[] lst = my_string.split(" ");
		int answer = 0;
		answer += Integer.parseInt(lst[0]);
		for (int i = 1; i < lst.length; i++) {
			if (lst[i].equals("+")) answer += Integer.parseInt(lst[i+1]);
			else if (lst[i].equals("-")) answer -= Integer.parseInt(lst[i+1]);
		}
        return answer;
    }
}
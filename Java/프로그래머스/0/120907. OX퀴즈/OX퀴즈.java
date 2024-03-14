class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
		int idx = 0;
		for (String q: quiz) {
			String[] lst = q.split(" ");
			int res = Integer.parseInt(lst[0]);
			for (int i = 1; i < lst.length; i++) {
				if (lst[i].equals("+")) res += Integer.parseInt(lst[i+1]);
				else if (lst[i].equals("-")) res -= Integer.parseInt(lst[i+1]);
				else if (lst[i].equals("=")) {
					if (res == Integer.parseInt(lst[i+1])) answer[idx] = "O";
					else answer[idx] = "X";
				}
			}
			idx ++;
		}
        return answer;
    }
}
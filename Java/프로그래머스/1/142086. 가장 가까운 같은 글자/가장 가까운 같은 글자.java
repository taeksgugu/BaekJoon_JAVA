import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<Character> lst = new ArrayList<>();
		int[] answer = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (lst.contains(s.charAt(i))) {
				for (int j = lst.size()-1; j >=0; j--) {
					if (lst.get(j).equals(s.charAt(i))) {
						answer[i] = lst.size() - j;
						break;
					}
				}
			} else {
				answer[i] = -1;
			}
			
			lst.add(s.charAt(i));
		}
        return answer;
    }
}
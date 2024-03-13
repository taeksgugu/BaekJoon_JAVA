import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
		List<Integer> lst = new ArrayList<>();
		
		for (int i=0;i<score.length;i++) {
			lst.add(score[i]);
			Collections.sort(lst);
			Collections.reverse(lst);
			if (lst.size()>k) {
				lst = lst.subList(0, k);
			}
            answer[i] = lst.get(lst.size()-1);
		}
        return answer;
    }
}
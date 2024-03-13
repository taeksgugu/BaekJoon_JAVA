import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
		int totalscore;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		
		for (int i = 0;i < photo.length;i++) {
			String[] ph = photo[i];
			totalscore = 0;
			for (String n: ph) {
				if (map.containsKey(n)) totalscore += map.get(n);
			}
			answer[i] = totalscore;
		}
        return answer;
    }
}
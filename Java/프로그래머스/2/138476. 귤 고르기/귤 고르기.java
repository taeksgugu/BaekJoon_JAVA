import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		// Map 내부 값 수정 혹은 입력
		for (int t: tangerine) {
			if (map.containsKey(t)) {
				map.replace(t, map.get(t)+1);	
			} else {
				map.put(t, 1);
			}
		}
		// Value 값 기준 정렬
		List<Integer> keyList = new ArrayList<>(map.keySet());
		
		// Value 내림차순 정렬 (lambda 표현식)
		keyList.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        for (int key : keyList) {
        	int cnt = map.get(key); //value값 가져오기
        	k -= cnt; // 갯수만큼 차감
        	answer += 1;
        	if (k<=0) break;
        }
        return answer;
    }
}
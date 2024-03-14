import java.util.*;
class Solution {
    public String solution(String rsp) {
        Map<String, String> map = new HashMap<>();
		map.put("2", "0");
		map.put("0", "5");
		map.put("5", "2");
		String answer = "";
		for (String s: rsp.split("")) {
			answer += map.get(s);
		}
        return answer;
    }
}
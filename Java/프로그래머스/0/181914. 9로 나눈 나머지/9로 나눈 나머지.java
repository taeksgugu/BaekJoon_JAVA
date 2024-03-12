class Solution {
    public int solution(String number) {
        int answer = 0;
		for (String a: number.split("")) {
			answer += Integer.parseInt(a)%9;
		}
		return answer%9;
    }
}
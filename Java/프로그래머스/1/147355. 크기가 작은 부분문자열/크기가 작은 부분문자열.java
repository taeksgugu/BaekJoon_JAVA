class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pnum = Long.parseLong(p);
		for (int i = 0; i < t.length()-p.length()+1; i++) {
			long tnum = Long.parseLong(t.substring(i, i+p.length()));
			System.out.println(pnum + ", " + tnum);
			if (tnum<=pnum) answer ++;
		}
        return answer;
    }
}
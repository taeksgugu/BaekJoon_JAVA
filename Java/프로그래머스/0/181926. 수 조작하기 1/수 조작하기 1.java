class Solution {
    public int solution(int n, String control) {
        for (String a: control.split("")) {
			if (a.equals("w")) {
				n += 1;
			} else if (a.equals("s")) {
				n -= 1;
			} else if (a.equals("d")) {
				n += 10;
			} else {
				n -= 10;
			}
		}
		
		return n;
    }
}
class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;
		
		while (n>=a && n>=2) {
			result += (n/a)*b;
			n = (n/a)*b+n%a;
		}
        
        return result;
    }
}
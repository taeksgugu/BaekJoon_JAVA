class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
		if (num%2==1) {
			int med = total/num;
			answer[num/2] = med;
			for (int i = 1; i <= num/2; i++) {
				answer[num/2-i] = med-i;
				answer[num/2+i] = med+i;
			}
			
		} else {
			int med = total/num;
			answer[num/2-1] = med;
			answer[num/2] = med+1;
			for (int i = 1; i < num/2; i++) {
				answer[num/2-1-i] = med-i;
				answer[num/2+i] = med+i+1;
			}
		}
        return answer;
    }
}
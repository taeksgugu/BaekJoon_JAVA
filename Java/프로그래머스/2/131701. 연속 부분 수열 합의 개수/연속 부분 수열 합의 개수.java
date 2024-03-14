import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
		int[] newarr = IntStream.concat(Arrays.stream(elements), Arrays.stream(elements)).toArray();
		for (int i = 0;i < elements.length; i++) { // 배열 합치기
			for (int j = 0; j < elements.length; j++) {
				int[] arr = Arrays.copyOfRange(newarr, i, i+j+1); //배열 인덱싱
				int total = Arrays.stream(arr).sum(); // 배열 합구하기
				set.add(total);
			}
		}
        
        return set.size();
    }
}
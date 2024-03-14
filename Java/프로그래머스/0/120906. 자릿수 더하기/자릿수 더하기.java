import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
class Solution {
    public int solution(int n) {
        return Arrays.stream(Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray()).sum();
		
    }
}
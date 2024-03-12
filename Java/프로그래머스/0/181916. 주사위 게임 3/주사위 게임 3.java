import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] numbers = new int[7];
        numbers[a] += 1;
        numbers[b] += 1;
        numbers[c] += 1;
        numbers[d] += 1;

        int result = 0, p = 0, q = 0, r = 0;
        int maxNum = Arrays.stream(numbers).max().getAsInt();

        if (maxNum == 4) {          // 4개 같을 때
            result = 1111 * a;
        } else if (maxNum == 3) {   // 3개 같을 때
            for (int idx = 0; idx < 7; idx++) {
                if (numbers[idx] == 3) {
                    p = idx;
                } else if (numbers[idx] == 1){
                    q = idx;
                }
                result = (int) Math.pow(10*p+q, 2);
            }
        } else if (maxNum == 2) { // 2개 같을 때
            boolean contains = Arrays.stream(numbers).anyMatch(num -> num == 1);
            if (contains) {         //어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(
                for (int idx = 0; idx < numbers.length; idx++) {
                    if (numbers[idx] == 1) {
                        if (q == 0) {
                            q = idx;
                        } else {
                            r = idx;
                        }
                    }
                }
                result = q * r;
            } else {                // 주사위가 두 개씩 같은 값
                for (int idx = 0; idx < numbers.length; idx++) {
                    if (numbers[idx] == 2) {
                        if (p == 0) {
                            p = idx;
                        } else {
                            q = idx;
                        }
                    }
                }
                result = (p + q) * (Math.abs(p - q));
            }
        } else {                    // 네 주사위 다 다른 경우
            for (int idx = 0; idx < numbers.length; idx++) {
                if (numbers[idx] > 0) {
                    result = idx;
                    break;
                }
            }
        }
        return result;
    }
}
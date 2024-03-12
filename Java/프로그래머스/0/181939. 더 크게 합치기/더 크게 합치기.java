class Solution {
    public int solution(int a, int b) {
        String m = String.valueOf(a) + String.valueOf(b);
        String n = String.valueOf(b) + String.valueOf(a);
        
        int m1 = Integer.parseInt(m);
        int n1 = Integer.parseInt(n);
        
        if (m1>=n1) return m1;
        else return n1;
    }
}
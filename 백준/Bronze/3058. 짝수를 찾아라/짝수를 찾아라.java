import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int minnum, num, total;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            minnum = Integer.MAX_VALUE;
            total = 0;
            for (int j = 0; j < 7; j++) {
                num = Integer.parseInt(st.nextToken());
                if (num%2==0) {
                    total += num;
                    if (num<minnum) minnum = num;
                }
            }
            bw.write(total + " " + minnum + "\n");
        }
        bw.close();
    }

}
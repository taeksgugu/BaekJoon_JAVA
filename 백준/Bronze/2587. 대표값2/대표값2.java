import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        List<Integer> lst = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            total += num;
            lst.add(num);
        }
        total/=5;
        Collections.sort(lst);
        bw.write(total+"\n");
        bw.write(lst.get(2)+"");
        bw.close();
    }

}
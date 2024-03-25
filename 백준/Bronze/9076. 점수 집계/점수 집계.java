import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> lst;
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            lst = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                lst.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(lst);
            if (lst.get(3)-lst.get(1) >= 4) {
                bw.write("KIN\n");
            } else {
                int num = (lst.get(1)+lst.get(2)+lst.get(3));
                bw.write(num+"\n");
            }
        }
        bw.close();
    }

}
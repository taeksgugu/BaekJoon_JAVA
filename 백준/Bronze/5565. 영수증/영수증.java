import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            total -= Integer.parseInt(st.nextToken());
        }

        bw.write(total + "");
        bw.close();

    }

}
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int now = 0, start = 0, answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        now = (h * 3600) + (m * 60) + s;

        st = new StringTokenizer(br.readLine(), ":");
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        start = (h * 3600) + (m * 60) + s;

        if(start > now) answer = start - now;
        else  answer = (24 * 3600) - (now - start);

        String answerTime = String.format("%02d:%02d:%02d", (answer / 3600), ((answer / 60) % 60), (answer % 60));
        bw.write(answerTime);
        bw.close();
    }

}
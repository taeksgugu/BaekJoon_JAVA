import java.io.*;
import java.math.BigInteger;
import java.util.*;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        BigInteger ab = BigInteger.valueOf(a);
        BigInteger bb = BigInteger.valueOf(b);
        ab = ab.add(bb);
        bw.write(ab + "");
        bw.close();
    }
}
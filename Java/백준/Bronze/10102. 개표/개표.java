import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws java.io.IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String result = st.nextToken();
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < n; i++) {
			if (result.charAt(i) == 'A') {
				a += 1;
			} else {
				b += 1;
			}
		}
		if (a==b) {
			bw.write("Tie");
		} else if (a>b) {
			bw.write("A");
		} else {
			bw.write("B");
		}
		bw.close();
	}
}
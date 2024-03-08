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
		StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
		int[] lst = new int[3];
		for (int i = 0; i < 3; i++) {
			lst[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(lst);
		bw.write(lst[1]+"");
		bw.close();
	}
}

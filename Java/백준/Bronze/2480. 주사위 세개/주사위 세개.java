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
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int result = 0;
		int[] lst = new int[3];
		lst[0] = a;
		lst[1] = b;
		lst[2] = c;
		Arrays.sort(lst);
		if (a==b && b==c) {
			result = 10000 + a*1000;
		} else if ((a==b && b!=c) | (a==c && b!=c) | (b==c && a!=c)) {
			if ((a==b && b!=c) | (a==c && b!=c)) {
				result = 1000+a*100;
			} else {
				result = 1000+b*100;
			}
		} else {
			result = lst[2]*100;
		}
		bw.write(result+"");
		bw.close();
	}
}
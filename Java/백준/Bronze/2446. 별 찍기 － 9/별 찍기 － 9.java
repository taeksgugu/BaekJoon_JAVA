import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws java.io.IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 공간 크기
		String stars = "*";
		StringBuilder sb;
		List<String> lst = new ArrayList<>();
		for (int i = n; i > 0; i--) {
			sb = new StringBuilder();
			for (int j = 0; j < n-i; j++) {
				sb.append(" ");
			}
			for (int j=1; j<i*2; j++) {
				sb.append("*");
			}
			lst.add(sb+"");
			bw.write(sb+"\n");
		}
		Collections.reverse(lst);
		for (int i = 1; i<lst.size(); i++) {
			bw.write(lst.get(i)+"\n");
		}
		bw.close();
	}
}
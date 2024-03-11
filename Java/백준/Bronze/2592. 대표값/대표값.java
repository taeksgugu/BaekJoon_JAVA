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
import java.util.List;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws java.io.IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		StringTokenizer st;
		List<Integer> lst = new ArrayList<>();
		int maxnum = 0;
		int maxcnt = Integer.MIN_VALUE;
		int total = 0;
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			lst.add(Integer.parseInt(st.nextToken()));
		}
		
		for (Integer num : lst) {
			if (maxcnt < Collections.frequency(lst, num)) {
				maxnum = num;
				maxcnt = Collections.frequency(lst, num);
			}
			total += num;
		}
		bw.write((total/10)+"\n");
		bw.write(maxnum+"");
		
		
		bw.close();
	}
}
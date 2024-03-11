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
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			if (n==-1) {
				break;
			}
			List<Integer> lst = new ArrayList<>();
			boolean sumok = true;
			for (int i = 2; i <= (int)Math.sqrt(n); i++) {
//				bw.write(i+"\t");
				if (n%i==0) {
					lst.add(i);
					lst.add(n/i);
				}
				
//				if (lst.stream().mapToInt(q->q).sum()-n > n) {
//					sumok = false;
//					break;
//				}
			}
			StringBuilder sb = new StringBuilder();
			if (lst.stream().mapToInt(i->i).sum()+1==n) {
				Collections.sort(lst);
				
				sb.append(n + " = 1 + ");
				for (int i = 0; i < lst.size(); i++) {
					sb.append(lst.get(i));
					if (i!=lst.size()-1) {
						sb.append(" + ");
					}
				}
				
			} else {
				sb.append(n + " is NOT perfect.");
			}
			bw.write(sb+"\n");
		}
		
		bw.close();
	}
}
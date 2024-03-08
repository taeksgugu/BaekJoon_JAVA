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
		String dish = st.nextToken();
		int result = 10;
		for (int i = 1; i < dish.length(); i++) {
			if (dish.charAt(i-1) == dish.charAt(i)) {
				result += 5;
			} else {
				result += 10;
			}
		}
		bw.write(result+"");
		bw.close();
	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws java.io.IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		StringTokenizer st = new StringTokenizer(br.readLine());; //StringTokenizer인자값에 입력 문자열 넣음
		int n = Integer.parseInt(st.nextToken());
		double result = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int num = st.countTokens();
			
			for (int j = 0; j < num; j++) {
				if (j == 0) {
					result = Double.parseDouble(st.nextToken());
				} else {
					String s = st.nextToken();
					if (s.equals("@")) {
						result *= 3;
					} else if (s.equals("%")) {
						result += 5;
					} else {
						result -= 7;
					}
				}
			}
			String res = String.format("%.2f", result);
			bw.write(res + "\n");
		}
		
		bw.close();
	}
}

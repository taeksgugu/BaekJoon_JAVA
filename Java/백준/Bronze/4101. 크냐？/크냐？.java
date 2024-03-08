import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws java.io.IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
	        int n = Integer.parseInt(st.nextToken());
	        int m = Integer.parseInt(st.nextToken());
	        
	        if (n==0 && m==0) {
	        	break;
	        }
	        
	        if (n>m) {
	        	bw.write("Yes\n");
	        } else {
	        	bw.write("No\n");
	        }
	        
		}
        bw.close();
	}
}
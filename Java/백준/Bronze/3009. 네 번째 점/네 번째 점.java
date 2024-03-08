import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.List;

public class Main{
	public static void main(String[] args) throws java.io.IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		StringTokenizer st;
		List<String> lst1 = new ArrayList<String>();
		List<String> lst2 = new ArrayList<String>();
		String a = "";
		String b = "";
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			a = st.nextToken();
			b = st.nextToken();
			if (lst1.contains(a)) {
				lst1.remove(a);
			} else {
				lst1.add(a);
			}
			if (lst2.contains(b)) {
				lst2.remove(b);
			} else {
				lst2.add(b);
			}
		}
		bw.write(lst1.get(0) + " " + lst2.get(0));
		
		
        bw.close();
	}
}
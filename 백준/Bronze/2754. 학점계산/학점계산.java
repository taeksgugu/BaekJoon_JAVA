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
		String n = st.nextToken();
		
		if (n.equals("A+")) bw.write("4.3");
		else if (n.equals("A0")) bw.write("4.0");
		else if (n.equals("A-")) bw.write("3.7");
		else if (n.equals("B+")) bw.write("3.3");
		else if (n.equals("B0")) bw.write("3.0");
		else if (n.equals("B-")) bw.write("2.7");
		else if (n.equals("C+")) bw.write("2.3");
		else if (n.equals("C0")) bw.write("2.0");
		else if (n.equals("C-")) bw.write("1.7");
		else if (n.equals("D+")) bw.write("1.3");
		else if (n.equals("D0")) bw.write("1.0");
		else if (n.equals("D-")) bw.write("0.7");
		else bw.write("0.0");
		bw.close();
	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		int n = Integer.parseInt(st.nextToken());
		int first = 0, second = 0, third = 0, forth = 0, axis = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a==0 | b==0) axis ++;
			else if (a>0) {
				if (b>0) first ++;
				else forth ++;
			} else {
				if (b>0) second ++;
				else third ++;
			}
		}

		bw.write("Q1: " + first + "\n");
		bw.write("Q2: " + second + "\n");
		bw.write("Q3: " + third + "\n");
		bw.write("Q4: " + forth + "\n");
		bw.write("AXIS: " + axis + "\n");
		bw.close();
	}
}

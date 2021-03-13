/*
 * 백준 10818번 문제 : 최소, 최대
 * 2021.3.13
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String arr[]=br.readLine().split(" ");
		int sort_arr[]=new int[arr.length];
		
		for(int i=0; i<sort_arr.length; i++) {
			sort_arr[i]=Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(sort_arr);
		
		bw.write(String.valueOf(sort_arr[0])+" "+String.valueOf(sort_arr[num-1]));
		
		bw.close();
		br.close();
	}

}

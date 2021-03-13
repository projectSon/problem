/*
 * 백준 2562번 문제 : 최댓값
 * 2021.3.13
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[]=new int[9];
		int max_index=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[max_index]<arr[i]) {
				max_index=i;
			}
		}
		Arrays.sort(arr);
		
		bw.write(String.valueOf(arr[(arr.length-1)]));
		bw.write("\n"+(max_index+1));
		bw.close();
		br.close();
	}

}

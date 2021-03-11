/*
 * 백준 10950번 문제 : A+B -3
 * 2021.3.10
 */
import java.io.*;

public class Problem10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		// 몇 번 반복할지 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int a[] = new int[T];
		int b[] = new int[T];
		
		for(int i=0; i<T; i++) {
			a[i] = Integer.parseInt(br.readLine());
			b[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(a[i]+b[i]);
		}
		
	}
}

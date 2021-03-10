import java.io.*;
/*
 * 백준 1003번 문제 : 피보나치 함수
 * 2021.3.9
 */
public class Problem1003 {


	public static void main(String[] args) throws IOException {
		// 몇번째 피보나치수열인지 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[T];
	
		for(int i=0; i<T; i++)arr[i] =  Integer.parseInt(br.readLine());
		
		int[] zero = new int[41];
		int[] one = new int[41];
		
		// 0과 1일 때 0과 1이 나오는 회수 저장하는 배열 초기화
		zero[0]=1; zero[1]=0;
		one[0]=0; one[1]=1;
		
		for(int j=2; j<41; j++) {
			zero[j]=zero[j-1]+zero[j-2];
			one[j]=one[j-1]+one[j-2];
		}
		
		for(int i=0; i<T; i++) { System.out.println(zero[arr[i]]+" "+one[arr[i]]);}
		br.close();
	}

}

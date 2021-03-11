/*
 * 백준 10950번 문제 : A+B -3
 * 2021.3.10
 */
import java.util.Scanner;

public class Problem15552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 몇 번 반복할지 
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a[] = new int[T];
		int b[] = new int[T];
		
		for(int i=0; i<T; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(a[i]+b[i]);
		}
		
	}
}

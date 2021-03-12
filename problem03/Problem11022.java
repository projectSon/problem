/*
 * 백준 11022번 문제 : A+B -8
 * 2021.3.12
 */
import java.util.Scanner;

public class Problem11022 {

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
			System.out.println("Case #"+(i+1)+": "+a[i]+" + "+b[i]+" = "+(a[i]+b[i]));
		}
		
	}
}

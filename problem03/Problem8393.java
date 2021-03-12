/*
 * 백준 8393번 문제 : 합
 * 2021.3.11
 */
import java.util.Scanner;

public class Problem8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 몇 번까지 더할지 입력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
	}
}

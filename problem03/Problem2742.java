/*
 * 백준 2741번 문제 : N 찍기
 * 2021.3.12
 */
import java.util.Scanner;

public class Problem2742 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~n 차례대로 출력할 때, n의 값 입력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}

}
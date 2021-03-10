/*
 * 백준 1008번 문제 : 두 수 비교하기
 * 2021.3.10
 */
import java.util.Scanner;

public class Problem1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			 System.out.println(">");
		}else if(a<b) {
			 System.out.println("<");
		}else System.out.println("==");
	}

}

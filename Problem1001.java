/*
 * 백준 1001번 문제 : A-B
 * 2021.3.3
 */
import java.util.Scanner;

public class Problem1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a, b값 받기
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int a = Integer.parseInt(str);
		str = s.next();
		int b = Integer.parseInt(str);
		
		System.out.println(a-b);
	}

}

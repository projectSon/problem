/*
 * 백준 2739번 문제 : 구구단
 * 2021.3.10
 */
import java.util.Scanner;

public class Problem2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 몇 단을 출력할지 정수 받기
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}

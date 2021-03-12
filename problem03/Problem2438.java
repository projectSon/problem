/*
 * 백준 2438번 문제 : 별 찍기 -1
 * 2021.3.12
 */
import java.util.Scanner;

public class Problem2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 몇 줄을 출력할지 입력 받기 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}

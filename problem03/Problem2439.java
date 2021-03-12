/*
 * 백준 2439번 문제 : 별 찍기 -2
 * 2021.3.12
 */
import java.util.Scanner;

public class Problem2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 몇 줄을 출력할지 입력 받기 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=num; j>num-i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}

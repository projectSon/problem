/*
 * 백준 14681번 문제 : 사분면 고르기 
 * 2021.3.10
 */
import java.util.Scanner;

public class Problem14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// x,y 좌표 받기
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if(x>0 && y>0) {
			System.out.println("1");
		}else if(x<0 && y>0) {
			System.out.println("2");
		}else if(x<0 && y<0) {
			System.out.println("3");
		}else System.out.println("4");
	}

}

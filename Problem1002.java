/*
 * 백준 1002번 문제
 * 2021.3.3
 */
import java.util.Scanner;

public class Problem1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복회수 받기
		Scanner s = new Scanner(System.in);
		int iteration_number = s.nextInt();
		int x1, y1, r1, x2, y2, r2;
		
		// 교점 구하기
		while(iteration_number>0) {
			// x1, y1, r1, x2, y2, r2 받기
			x1 = s.nextInt();
			y1 = s.nextInt();
			r1 = s.nextInt();
			x2 = s.nextInt();
			y2 = s.nextInt();
			r2 = s.nextInt();

			System.out.println(distance(x1, y1, r1, x2, y2, r2));
			iteration_number--;

		}
	}

	// 교점 구하는 메소드
	private static int distance(int x1, int y1, int r1, int x2, int y2, int r2) {
		double d; // (x1, y1)과 (x2, y2) 사이의 거리
		d = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
	
		if(d==0&&r1==r2) {
			return -1;
		}else if(d>r1+r2||d<Math.abs(r1-r2)){
			return 0;
		}else if(d==r1+r2||Math.abs(r1-r2)==d){
			return 1;
		}else return 2;
	}

}

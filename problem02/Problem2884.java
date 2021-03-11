/*
 * 백준 2884번 문제 : 알람 시계
 * 2021.3.10
 */
import java.util.Scanner;

public class Problem2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// hour,minute 받기
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		// 예상 시간보다 45분 이른 알람 설정하기	
		if(minute>=45) {
			minute-=45;
		}else {
			if(hour==0) {
				hour=24;
			}
			hour-=1;
			minute+=15;
		}
			
		System.out.println(hour+" "+minute);
	}

}

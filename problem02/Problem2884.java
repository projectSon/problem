/*
 * ���� 2884�� ���� : �˶� �ð�
 * 2021.3.10
 */
import java.util.Scanner;

public class Problem2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// hour,minute �ޱ�
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		// ���� �ð����� 45�� �̸� �˶� �����ϱ�	
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

/*
 * 문제 2908번 : 상수
 * 2021.3.21
 */

import java.util.Scanner;

public class Problem2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input_num[] = new String[2];
		String output_num[] = new String[2];
		
		for(int i=0; i<input_num.length; i++) {
			input_num[i]=sc.next();
		}
		
		for(int i=0; i<input_num.length; i++) {
			for(int j=2; j>=0; j--) {
				if(j==2) {
					output_num[i]=""+input_num[i].charAt(j);
				}else output_num[i]+=""+input_num[i].charAt(j);
			}
		}
		
		int max=0;
		
		if(Integer.parseInt(output_num[0])<Integer.parseInt(output_num[1])) {
			max=Integer.parseInt(output_num[1]);
		}
		else max=Integer.parseInt(output_num[0]);
		System.out.println(max);
	}

}

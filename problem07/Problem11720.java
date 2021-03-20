/*
 * 백준 11720번 문제 : 숫자의 합
 * 2021.3.20
 */

import java.util.Scanner;

public class Problem11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());		
		String input = sc.nextLine();
		
		String tmp[]=input.split("");
		
		int input_num[]=new int[num];
		int sum=0;
		
		for(int i=0; i<tmp.length; i++) {
			input_num[i]=Integer.parseInt(tmp[i]);
			sum+=input_num[i];
		}
		
		System.out.println(sum);
		
	}

}

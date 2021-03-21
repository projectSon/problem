/*
 * 문제 2675번 : 문자열 반복
 * 2021.3.21
 */

import java.util.Scanner;

public class Problem2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		int repeat_num[]=new int[num];
		String repeat_word[]=new String[num];
		for(int i=0; i<num; i++) {
			repeat_num[i]=sc.nextInt();
			repeat_word[i]=(sc.nextLine()).trim();
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<repeat_word[i].length(); j++) {
				for(int k=0; k<repeat_num[i]; k++) {
					System.out.print(repeat_word[i].charAt(j));
				}
			}
			System.out.println();
		}

	}

}

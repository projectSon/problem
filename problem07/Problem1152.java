/*
 * 문제 1152번 : 단어의 개수
 * 2021.3.21
 */

import java.util.Scanner;

public class Problem1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();		
		String word[]=input.split(" ");
		int num=0;
		for(int i=0; i<word.length; i++) {
			if(word[i].equals("")) {
				continue;
			}else num++;
		}
		System.out.println(num);
	}

}

/*
 * 백준 2577번 문제 : 숫자의 개수
 * 2021.3.13
 */

import java.util.Scanner;

public class Problem2577 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num[]=new int[3];
		int mul=1;
		for(int i=0; i<3; i++) {
			num[i]=sc.nextInt();
			mul*=num[i];
		}
		String val[]=Integer.toString(mul).split("");
		int count[]=new int[10];
		
		for(int i=0; i<val.length; i++) {
			count[Integer.parseInt(val[i])]++;
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}

}

/*
 * 백준 3052번 문제 : 나머지
 * 2021.3.13
 */

import java.util.Scanner;

public class Problem3052 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num[]=new int[10];
		int count[]=new int[42];
		int diff_value=0;
		for(int i=0; i<num.length; i++) {
			num[i]=sc.nextInt();
			count[num[i]%42]++;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]==0) {
				continue;
			}else diff_value++;
		}
		System.out.println(diff_value);
	}

}

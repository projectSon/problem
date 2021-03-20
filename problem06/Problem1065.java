/*
 * 백준 1065번 문제 : 한수
 * 2021.3.20
 */

import java.util.Scanner;

public class Problem1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		int h_num=0;
		
		if(num<100) {
			h_num=num;
		}else {
			h_num=99;
			int j=100;
			while(j<=num) {
				String arr[] = (Integer.toString(j)).split("");
				int arr_num[]=new int[arr.length];
			
				for(int i=0; i<arr_num.length; i++) {
					arr_num[i]=Integer.parseInt(arr[i]);
					//System.out.println(arr_num[i]);
				}
			
				int minus_num[]=new int[arr_num.length-1];
			
				for(int i=0; i<minus_num.length; i++) {
					minus_num[i]=arr_num[i+1]-arr_num[i];
				}
				if(minus_num[0]==minus_num[1]) {
					h_num++;
				}
				j++;
			}
		}
		System.out.println(h_num);
	}

}

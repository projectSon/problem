/*
 * 백준 1110번 문제 : 더하기 사이클
 * 2021.3.13
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		ArrayList<String> string_num = new ArrayList<String>();
		
		if(Integer.parseInt(input)>=10) {
			String input_num[] = input.split("");
			string_num.add(input_num[0]);
			string_num.add(input_num[1]);
		}else{
			string_num.add("0");
			string_num.add(input);
		}
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(Integer.parseInt(string_num.get(0)));
		num.add(Integer.parseInt(string_num.get(1)));

		int cycle=0;
		int i=1;
		while(true) {
			int sum = num.get(i-1)+num.get(i);
			// 10 이상
			if(Integer.parseInt(input)>=10) {
				if(input.equals(num.get(i-1)+""+num.get(i))==true && i!=1) {
					break;
				}
				else {
					if(sum>=10) {
						String input_num[] = Integer.toString(sum).split("");
						string_num.add(input_num[1]);
					}else{
						string_num.add(Integer.toString(sum));
					}
					num.add(Integer.parseInt(string_num.get(++i)));
					cycle++;
				}
			}
			else if(!(Integer.parseInt(input)>=10)) {
				//System.out.println(999);
				if(input.equals(""+num.get(i))==true&&i!=1&&num.get(i-1)==0){
					break;
				}
				else {
					if(sum>=10) {
						String input_num[] = Integer.toString(sum).split("");
						string_num.add(input_num[1]);
					}
					else{
						string_num.add(Integer.toString(sum));
					}
					num.add(Integer.parseInt(string_num.get(++i)));
					cycle++;
				}
				
			}
			
		}
		System.out.println(cycle);
			
	}
	
}

/*
 * 백준 1546번 문제 : 평균
 * 2021.3.13
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem1546 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int score[]=new int[T];
		int max_value=0;
		for(int i=0; i<T; i++) {
			score[i]=Integer.parseInt(sc.next());
		}
		Arrays.sort(score);

		max_value=score[score.length-1];
		
		double vir_score[]=new double[T];
		double sum=0;
		for(int i=0; i<T; i++) {
			vir_score[i] =(double)score[i]/(double)max_value*100;
			sum+=vir_score[i];
		}

		System.out.println(sum/T);
	}

}

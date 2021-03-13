/*
 * 백준 4344번 문제 : 평균은 넘겠지	
 * 2021.3.13
 */

import java.util.Scanner;

public class Problem4344 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int C = Integer.parseInt(sc.nextLine());
		int student[]=new int[C];
		int sum[]=new int[C];
		double avg[]=new double[C];
		int count[]=new int[C];
		for(int i=0; i<C; i++) {
			student[i]=sc.nextInt(); // 테스트케이스에 따른 학생의 수
			int score[]=new int[student[i]]; // 학생의 점수
			for(int j=0; j<score.length; j++) {
				score[j]=sc.nextInt();
				sum[i]+=score[j];
			}
			avg[i]=(double)sum[i]/(double)student[i];
			for(int j=0; j<score.length; j++) {
				if(avg[i]<(double)score[j]) {
					count[i]++;
				}else;
				
			}
		}
		
		for(int i=0; i<C; i++) {
			System.out.println(String.format("%.3f",(double)count[i]/(double)student[i]*100)+"%");
		}// for
		
	}// main method

}// class

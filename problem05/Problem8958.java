/*
 * ���� 8958�� ���� : OX����
 * 2021.3.13
 */

import java.util.Scanner;

public class Problem8958 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		
		String ox[]=new String[T];
		
		int score=0;
		int score_sum=0;
		for(int i=0; i<T; i++) {
			ox[i]=sc.nextLine();
		}

		for(int i=0; i<T; i++) {
			score=0;
			score_sum=0;
			String scoreOX[]= ox[i].split("");
			for(int j=0; j<scoreOX.length; j++) {
				// ó�� ���� �ƴϰ� ���� ���� O�鼭 ���� ���� O �� ��
				if(j>0&&scoreOX[j-1].equals("O")&&scoreOX[j].equals("O")) {
					++score;
					score_sum+=score;
				}
				// ó�� ���� �ƴϰ� ���� ���� X�鼭 ���� ���� O �� ��
				else if(j>0&&scoreOX[j-1].equals("X")&&scoreOX[j].equals("O")){
					score=1;
					score_sum+=score;
					
				}
				// ó�� ���� ��
				else if(j==0) {
					if(scoreOX[0].equals("O")) {
						score=1;
						score_sum+=score;
					}else;
				}else {
					score=0;
				}
			}
			System.out.println(score_sum);
		}
		
	}

}

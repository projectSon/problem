/*
 * 문제 10809번 : 알파벳 찾기
 * 2021.3.20
 */
import java.util.Scanner;

public class Problem10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char[] alp = new char[input.length()] ;

		int i=0;
		for(i=0; i<alp.length; i++) {
			alp[i]=input.charAt(i);
		}
		int num[] = new int[26]; // ���ĺ� 26��
		
		for(i=0; i<num.length; i++) {
			num[i]=-1;
		}
		
		
		for(i=0; i<alp.length; i++) {
			if(num[(int)alp[i]-97]==-1) {
				num[(int)alp[i]-97]=i;
			}else ;
		}
		
		
		for(i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}

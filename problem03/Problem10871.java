/*
 * 백준 10871번 문제 : X보다 작은 수
 * 2021.3.12
 */
import java.util.Scanner;

public class Problem10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 몇 번 반복할지 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = sc.nextInt();
		int a[]=new int[num];
		for(int i=0; i<num; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<num; i++) {
			if(a[i]<x) {
				System.out.print(a[i]+" ");
			}else ;
		}
	}
}

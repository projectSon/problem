/*
 * ���� 2588�� ���� : ����
 * 2021.3.10
 */
import java.util.Scanner;
public class Problem2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// a,b�� �ޱ�
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		// a�� ���������� ��ȯ
		int a_num=Integer.parseInt(a);
		
		// b�� �ڸ������� �߶� arr��� �迭�� ����
		String arr[]=b.split("");
		
		// b�� �ڸ������� ����� ���� ���������� ������ �迭 ����
		int bn[]=new int[arr.length];
		
		// ������ ����� ���� ����
		int result=0;
		
		for(int i=0; i<bn.length; i++) {
			// �� �ֱ�
			bn[i]=Integer.parseInt(arr[bn.length-1-i]);
			// a*b�� �� �ڸ����� ����� ���
			System.out.println(a_num*bn[i]);
			// ���� �ڸ��� *10^n�� ���ֱ�
			result+=a_num*bn[i]*Math.pow(10,i);
		}
		System.out.println(result);
	}

}

/*
 * ���� 2739�� ���� : ������
 * 2021.3.10
 */
import java.util.Scanner;

public class Problem2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �� ���� ������� ���� �ޱ�
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}

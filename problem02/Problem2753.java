/*
 * ���� 2753�� ���� : ����
 * 2021.3.10
 */
import java.util.Scanner;

public class Problem2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� �ޱ�
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("1");
		}else System.out.println("0");

	}

}

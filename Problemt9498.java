/*
 * ���� 9498�� ���� : ���� ����
 * 2021.3.10
 */
import java.util.Scanner;

public class Problemt9498 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		// ���� �ޱ�
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// ��޺��� ȯ���ϱ�
		if(score>=90&&score<=100) {
			System.out.println("A");
		}else if(score>=80&&score<90) {
			System.out.println("B");
		}else if(score>=70&&score<80) {
			System.out.println("C");
		}else if(score>=60&&score<70) {
			System.out.println("D");			
		}else System.out.println("F");
	}
}

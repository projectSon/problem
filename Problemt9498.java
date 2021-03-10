/*
 * 백준 9498번 문제 : 시험 성적
 * 2021.3.10
 */
import java.util.Scanner;

public class Problemt9498 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		// 점수 받기
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 등급별로 환산하기
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

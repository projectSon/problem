/*
 * 백준 2588번 문제 : 곱셈
 * 2021.3.10
 */
import java.util.Scanner;
public class Problem2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// a,b값 받기
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		// a값 정수형으로 변환
		int a_num=Integer.parseInt(a);
		
		// b값 자리수별로 잘라서 arr라는 배열에 저장
		String arr[]=b.split("");
		
		// b값 자리수별로 계산을 위해 정수형으로 저장할 배열 생성
		int bn[]=new int[arr.length];
		
		// 곱셈한 결과값 변수 생성
		int result=0;
		
		for(int i=0; i<bn.length; i++) {
			// 값 넣기
			bn[i]=Integer.parseInt(arr[bn.length-1-i]);
			// a*b의 각 자리수별 결과값 출력
			System.out.println(a_num*bn[i]);
			// 곱셈 자리수 *10^n씩 해주기
			result+=a_num*bn[i]*Math.pow(10,i);
		}
		System.out.println(result);
	}

}

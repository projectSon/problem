/*
 * ���� 15596�� ���� : ���� N���� ��	
 * 2021.3.13
 */

import java.util.Scanner;

public class Problem15596 {
    
    static long sum(int[] a) {
       	long ans=0;
		for(int i=0; i<a.length; i++){
			ans+=a[i];
		}
		return ans;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
	
		System.out.println(sum(arr));
	}
}

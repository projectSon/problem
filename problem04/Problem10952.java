import java.util.ArrayList;
import java.util.Scanner;

/*
 * 백준 10952번 문제 : A+B -5
 * 2021.3.12
 */
public class Problem10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		a.add(sc.nextInt());
		b.add(sc.nextInt());

		int i=0;
		
		
		while(a.get(i)!=0 && b.get(i)!=0) {
			i++;
			a.add(sc.nextInt());
			b.add(sc.nextInt());
		}	
		
		i=0;
		
		while(i!=a.size()-1) {
			System.out.println(a.get(i)+b.get(i));
			i++;
		}
		
	}
	
}

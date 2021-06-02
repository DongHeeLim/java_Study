import java.util.Scanner;

public class _sumAeverage {

	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double avg;
		Scanner sc = new Scanner(System.in);
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = (double) tot/3;
		System.out.println(avg);	
		sc.close();
	}

}

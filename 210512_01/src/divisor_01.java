import java.util.Scanner;

public class divisor_01 {

	public static void main(String[] args) {
		int input_number;
		int[] divisor = new int[100];
		int cnt = 0;
		System.out.print("����� ���� �� : ");
		Scanner sc = new Scanner(System.in);
		input_number = sc.nextInt();
		for (int i=1; i<=100;i++)
		{
			if (input_number % i == 0) {				
				divisor[cnt++] = i;
			}
		}
		for(int j=0; j<cnt; j++) {
			System.out.print(divisor[j] + " ");
		} 
		
		sc.close();
		

	}

}
 
import java.util.Scanner;

public class decimalToBinary_01 {

	public static void main(String[] args) {
		int B[]= new int[10];
		int index=0;
		int quotient, remainder;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		do {
			quotient = num/2;
			remainder = num - quotient*2;
			B[index] = remainder;
			index++;
			num = quotient;
			
		}while(quotient!=0);
		
		for(int i=B.length-1; i>=0; i--) {
			System.out.print(B[i] + " ");
		}
		
		sc.close();

	}

}

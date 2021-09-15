import java.util.Scanner;

public class decimalToBinary_02 {

	public static void main(String[] args) {
		int Array_size = 8;
		int cnt=0, quotient, remainder, subscript;
		int bin[] = new int[Array_size];
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		do{
			quotient = dec/2;
			remainder = dec - quotient*2;
			cnt++;
			bin[cnt] = remainder;
		}while(remainder != 0);
		
		for(int i=0; i < bin.length; i++) {
			
		}
	}
}

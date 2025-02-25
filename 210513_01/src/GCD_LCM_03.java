import java.util.Scanner;

public class GCD_LCM_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입려하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입려하세요 : ");
		int num2 = sc.nextInt();
		int big, small;
		int LCM, remainder = 1;
		
		if(num1 >= num2) {
			big = num1;
			small = num2;
		} 
		else {
			big = num2;
			small = num1;
		} 
		
		
		while(remainder > 0) {
			remainder = big%small;
			big = small;	// 최종small : 최대 공약수
			small = remainder;
			
		}
		
		LCM = num1*num2/big; // 최종big = small

		System.out.println("최대 공약수 : "+big);
		System.out.println("최소 공배수 : "+LCM);
		sc.close();

	}

}

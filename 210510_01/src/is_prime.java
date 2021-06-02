import java.util.Scanner;

public class is_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("숫자를 입력해주세요 : ");
			num = sc.nextInt();
			int div_num = 2;
			if (num == 0) break;
			while(num % div_num != 0) div_num++;
			System.out.print("결과 : ");
			if(num == div_num) System.out.println("소수");
			else System.out.println("소수아님");
		
		}
		sc.close();
	}

}

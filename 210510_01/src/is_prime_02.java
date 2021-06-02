import java.util.Scanner;

public class is_prime_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean flag;
		
		do {
			flag = false;
			int div_num = 2;
			
			System.out.print("숫자를 입력해주세요 : ");
			num = sc.nextInt();
			
			if (num == 0) break;
			if (num == 1) {
				flag = true;
				System.out.println("다시 입력해주세요");
			}
			else
			{
				while(num % div_num != 0) div_num++;
				System.out.print("결과 : ");
				if(num == div_num) System.out.println("소수");
				else System.out.println("소수아님");
				
			}
				
			
			
		}while(flag);
		
		System.out.println("---끝---");
		
		sc.close();
	}

}

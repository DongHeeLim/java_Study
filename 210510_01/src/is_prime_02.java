import java.util.Scanner;

public class is_prime_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean flag;
		
		do {
			flag = false;
			int div_num = 2;
			
			System.out.print("���ڸ� �Է����ּ��� : ");
			num = sc.nextInt();
			
			if (num == 0) break;
			if (num == 1) {
				flag = true;
				System.out.println("�ٽ� �Է����ּ���");
			}
			else
			{
				while(num % div_num != 0) div_num++;
				System.out.print("��� : ");
				if(num == div_num) System.out.println("�Ҽ�");
				else System.out.println("�Ҽ��ƴ�");
				
			}
				
			
			
		}while(flag);
		
		System.out.println("---��---");
		
		sc.close();
	}

}

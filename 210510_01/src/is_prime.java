import java.util.Scanner;

public class is_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("���ڸ� �Է����ּ��� : ");
			num = sc.nextInt();
			int div_num = 2;
			if (num == 0) break;
			while(num % div_num != 0) div_num++;
			System.out.print("��� : ");
			if(num == div_num) System.out.println("�Ҽ�");
			else System.out.println("�Ҽ��ƴ�");
		
		}
		sc.close();
	}

}

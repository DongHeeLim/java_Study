import java.util.Scanner;

public class _changer {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc2 = new Scanner(System.in);
		a = sc2.nextInt();
		b = sc2.nextInt();
	
		System.out.println("a = "+a+", b = "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("a = "+a+", b = "+b);
		sc2.close();
			
	}
}

import java.util.Scanner;

public class most_in_two {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) System.out.println(a);
		else System.out.println(b);
		
		sc.close();

	}

}

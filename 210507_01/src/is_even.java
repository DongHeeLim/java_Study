import java.util.Scanner;

public class is_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%2==0) System.out.println("even");
//	if((a-(a/2)*2) == 0) System.out.println("even");
		else System.out.println("odd");
		
		sc.close();
		

	}

}

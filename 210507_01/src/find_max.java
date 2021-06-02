import java.util.Scanner;

public class find_max {

	public static void main(String[] args) {
		int a,b,c,max;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		max = a;
		if(b>max) max=b;
		if(c>max) max=c; 
		
		System.out.println("�ִ밪:"+max);
		sc.close();

	}

}

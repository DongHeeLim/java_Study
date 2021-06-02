import java.util.Scanner;

public class array_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		System.out.print("배열 길이 : ");
		int len = sc.nextInt();
		arr = new int[len];
		for(int i=0; i<arr.length;i++){
			arr[i] = sc.nextInt();			
		}
		
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
		

	}

}

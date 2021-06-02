
public class for_one_To_hundred {

	public static void main(String[] args) {
		for	(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		int j=1;
		for(;;) {
			if(j>100) break;
			System.out.println(j);
			j++;
			
		}
	}

}

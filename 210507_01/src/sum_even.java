
public class sum_even {

	public static void main(String[] args) {
		int even_sum = 0;
		int cnt = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 ==0) {
				System.out.println(i);
				even_sum += i;
				cnt++;
			}
		}
		
		System.out.println("개수="+cnt);
		System.out.println("합계="+even_sum);
		System.out.println("평균="+(double)even_sum/cnt);

	}

}

public class divisor_02 {

	public static void main(String[] args) {
		int cnt = 0, sum, divisor_range;
		
		for(int i=4; i <=1000; i++) {
			sum = 0;
			divisor_range = (int)i/2;
			for (int j=1; j<=divisor_range; j++) {
				if(i%j == 0) sum += j;
			}
			
			if(i == sum) {
				cnt++;
				System.out.println(sum);
			}
		}
		System.out.println(cnt + "��");

	}

}

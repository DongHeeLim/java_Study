
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
		
		System.out.println("����="+cnt);
		System.out.println("�հ�="+even_sum);
		System.out.println("���="+(double)even_sum/cnt);

	}

}

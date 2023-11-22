package testjava_20231122_00;

public class ForExer_00 {
	
	public static void main(String[] args) {
		
		for (char i=65; i<='Z'; i++) {
			
			System.out.print(i);
		}
		
		//1부터 100까지의 수 중 짝수가 몇개인지 출력
		
		int count = 0;
		
		for (int i=0; i<101; i++) {
			if (i % 2 == 0) {
				count += 1;
			}
		}
		
		System.out.print(count);
		
		
	}

}

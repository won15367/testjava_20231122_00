package testjava_20231122_00;

public class ForTest_00 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i<11; i+=2) {   // for(초기값;조건식;증감식)
			System.out.println(i);
		}
		
		int result1 = 0;
		
		for (int i=1;i<1001;i++) {
			result1 += i;
		}
		
		System.out.println(result1);
		
		// 1부터 100까지의 숫자 중에서 3의 배수의 합을 구하시오
		
		int result2 = 0;
		
		for (int i=3; i<101; i+=3) {
			result2 += i;
		}
		
		System.out.println(result2);
	}
}

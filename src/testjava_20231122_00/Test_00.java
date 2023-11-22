package testjava_20231122_00;

public class Test_00 {
	
	public static void main(String[] args) {
		
		int score = 100;
		
		if (score >= 90) {
			System.out.println("수");
		} else if (score >= 80){
			System.out.println("우");			
		} else if (score >= 70) {
			System.out.println("미");
		} else if (score >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
				
		System.out.println("if문 종료됨");
	}

}

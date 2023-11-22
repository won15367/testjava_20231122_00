package testjava_20231122_00;

public class ForExer_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<3; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		

	}

}

package testjava_20231122_00;

public class ForTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 출력 프로그램
		for (int i=2; i<10; i++) {
			for (int j=1; j<10; j++) {
				int cen = i * j;
				System.out.println(i+" * "+j+"는 "+cen+"입니다.");
			}
			System.out.println("=============================");
		}

	}

}

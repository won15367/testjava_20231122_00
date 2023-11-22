package testjava_20231122_00;

public class WhileTest_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a  = 0;
		
		while (a<3) {
			System.out.println("안녕하세요" + a);
			a++;
		}
		
		while (a>0) {
			System.out.println("안녕하세요" + a);
			a++;
			if (a>=20) {
				break;
			}
		}
		
		while (a<30) {
			a++;
			if (a % 2 ==0) {
				continue;
			}
			System.out.println(a);
		}
	}

}

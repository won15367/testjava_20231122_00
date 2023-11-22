package testjava_20231122_00;

import java.util.Scanner;

public class SwitchExer {
	
	public static void main(String[] args) {
		System.out.println("해당 월의 일수를 알고 싶은 월을 숫자로 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		System.out.println(month);
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일입니다.");
			break;
		case 2:
			System.out.println("28일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일입니다.");
			break;
		default:
			break;
		}
	}

}

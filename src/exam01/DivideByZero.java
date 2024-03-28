package exam01;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("나누어지는 수(정수) 입력: ");
		int num1 = input.nextInt();
		
		System.out.print("나누는 수(정수) 입력: ");
		int num2 = input.nextInt();
		
		if(num2 == 0) {
			System.out.println("나눗셈 불가...");
			return;
		}else {
			System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		}
		
		System.out.println("프로그램 종료.");
		System.out.println("1차 기능 완료");
	}
}

package exam04;

import java.util.Scanner;

public class ExceptionHandlerUseTryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i < 3; i++) {
			try {
				System.out.print("피제수 입력: ");
				int num1 = input.nextInt();
				
				System.out.print("제수 입력: ");
				int num2 = input.nextInt();
				
				System.out.print("연산 결과를 저장할 배열의 인덱스 입력: ");
				int index = input.nextInt();
				
				arr[index] = num1 / num2;
			}catch(ArithmeticException e) {
				System.out.println("나눗셈 불가능.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
		
		for(int e : arr) {
			System.out.println(e);
		}
	}
}

package exam07;

import java.util.Scanner;

class AgeInputException extends Exception{
	AgeInputException(){
		super("유효하지 않은 나이를 입력하셨습니다.");
	}
}

public class ThrowsFromUpperMethod {
	public static void main(String[] args) throws AgeInputException {
		int age = callAge();
	}
	
	public static int callAge() throws AgeInputException {
		System.out.println("나이를 입력하세요: ");
		
		int age = readAge();
		return age;
	}
	
	public static int readAge() throws AgeInputException {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if(age < 0) {
			AgeInputException expt =  new AgeInputException();
			throw expt;
		}
		
		return age;
	}
}

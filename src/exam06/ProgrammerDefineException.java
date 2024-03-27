package exam06;

import java.util.Scanner;

class AAA {
	AAA() {}
}

class BBB {
	public void method() {
		AAA a = new AAA();
		
		
		try {
			a.wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class AgeInputException extends Exception{
	AgeInputException(){
		super("유효하지 않은 나이를 입력하셨습니다.");
	}
}

public class ProgrammerDefineException {
	public static void main(String[] args) {
		System.out.print("나이를 입력하세요: ");
		
		try {
			int age = readAge();
			
			System.out.println("당신의 나이는 " + age + "살이군요.");
		} catch (AgeInputException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
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

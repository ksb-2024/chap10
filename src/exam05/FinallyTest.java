package exam05;

public class FinallyTest {
	public static void main(String[] args) {
		boolean divOk = false;
		
		divOk = divider(10,5);
		if(divOk) {
			System.out.println("연산 성공");
		}else {
			System.out.println("연산 실패");
		}
		divOk = divider(150,0);
		if(divOk) {
			System.out.println("연산 성공");
		}else {
			System.out.println("연산 실패");
		}
		System.out.println("프로그램 종료.");
	}
	
	public static boolean divider(int n1, int n2) {
		boolean divResult = false;
		
		try {
			int result = n1 / n2;
			System.out.println("연산 실행.");
			//return true;
			divResult = true;
		}catch(ArithmeticException e) {
			System.out.println("나눗셈 불가능.");
			//return false;
			divResult = false;
		}finally {
			System.out.println("finally 실행.");
		}
		
		return divResult;
		
	}
}

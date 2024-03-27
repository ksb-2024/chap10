package exam03;

public class RuntimeExceptionCase {
	public static void main(String[] args) {
		/*
		try {
			int[] arr = new int[3];
			arr[-1] = 20;	// 변수가 있다면 실행하는 시점에 따라 값이 달라짐... 그래서 -1 넣어도 오류체크X
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Object obj = new int[10];
			String str = (String)obj;
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		/*
		try {
			int[] arr = new int[-10];
		}catch(NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		try {
			String name = null;
			name.length();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}

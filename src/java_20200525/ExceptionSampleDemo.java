package java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {
		//String msg = null;
		//NullPointerException 예외 발생 
		//int msgLength = msg.length();
		//System.out.println(msgLength);
		
		//int[] array = {1,2,3};
		//ArrayIndexOutOFBoundsException 예외 발생
		//int temp = array[3];
		
		//ArithemeticException 예외 발생
		//int result = 3/0;
		//System.out.println(result);
		
		//NumberFormatException 예외발생
		//*개발자가 아닌 사용자가 값을 설정하기 때문에 예외발생 =>에 대비한 예외처리필요
		int first = Integer.parseInt("a");
		System.out.println(first);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package java_20200512;
//ctrl + shift + f => 자동으로 줄 맞춰주기
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = 0;
		double d = 0;
		
		c = a + b;
		System.out.println(c);
				
		c = a - b;
		System.out.println(c);
		
		d = b/a;
		System.out.println(d);
		
		c = a*b;
		System.out.println(c);
		

		
		
		int sum = 0;
		for(int i=1;1<=100;i++) {
			//sum = sum + 1
			//sum += i;
			System.out.println(sum);
		
		
		
		a = 10;  
		b = 20;  
				
		a++;  // a = a+1
		++b;  // b = b+1;
		
		System.out.println(a);
		System.out.println(b);
		
		//대입 후 증가
		c = a++; // c => 11
		System.out.println(c);
		
		//증가 후 대입 
		c = ++b; // c => 22
		System.out.println(c); 
		
		
		a = 10;
		b = 20;
		d = 10.0;
		
		
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);
		
		isSuccess = a < b;
		System.out.println(isSuccess);
		
		isSuccess = a >= b;
		System.out.println(isSuccess);
		
		isSuccess = a <= b;
		System.out.println(isSuccess);
		
		//primitive data type의 == 연산자는 자료형에 상관없이 값만 같으면 
		//true를 반환한다.
		isSuccess = a == d;
		System.out.println(isSuccess);
		
		isSuccess = a != d;
		System.out.println(isSuccess);
		
		
		System.out.println( 4 & 5);
		System.out.println( 4 | 5);
		System.out.println( 4 ^ 5); 
		
		a = 10;
		b = 20;
		
		//a && b => a가 false면 
				
		isSuccess = (a==b) && (++a==b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		// + => 연결연산자(두개중 1개 이상이 문자열이 경우)
		//, 산술연술자 (두개 모두 숫자일 경우)
		
		System.out.println(1+2+3+"456");
		
				
		
		
	}   
 }	
}	
	
	
  


	




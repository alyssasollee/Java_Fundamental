package java_20200514;

public class ArrayDemo {
	public static void main(String[] args) {
		//1. 배열 선언 및 생성 - int의 기본값 0으로 4개생성
		int[] a = new int[4];
		
		//2. 배열 할당
		a[0] = 1;
		a[1] = 2; 
		a[2] = 3;
		a[3] = 4;
		
		System.out.println(123);


		
		
		//3. 배열 출력
		//a.length : 배열의 길이
		//실행 ctrl + f11
		for(int i=0 ; i<a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		//배열 선언, 생성, 할당이 동시에 이루어짐.
		int[] b = {100,200,300,400,500};
		
		//베열의 값 변경(할당)
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;
		
		//배열 출력 => for loop : index나타내고 싶을 때
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		//배열 출력 => enhanced for loop : 값만 찾고 싶을 때, 개발자 실수없이 다 찾음. 
		for (int value : b) {
			System.out.println(value);
		}
		
		//객체는 하나, 참조하는 변수가 둘/class,array,interface만 가능
		int[] c = a;
		c[0] = 11;
		
		System.out.println(a[0]);
		System.out.println(c[0]);
	}

}

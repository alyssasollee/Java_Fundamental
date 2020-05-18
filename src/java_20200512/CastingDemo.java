package java_20200512;

public class CastingDemo {
	public static void main(String[] args) {
		//byte 범위를 넘어가면 에러 발생
		//형변환을 하면 에러가 발생하지 않고, circuit 발생
		byte a = (byte)128;
		System.out.println(a);
		
		byte b = 126;
		System.out.println(b);
		
		
		
	}

}

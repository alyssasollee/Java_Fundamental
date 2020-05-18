package java_20200515;
//Customer 클래스
public class Customer {
	//클래스의 멤버 변수 - instance 변수(public이랑 String사이 nothing), static변수, final 변수(변하지 않는 상수)*
	//인스턴스 변수(name, email, phone, balance, isReleased)
	//객체가 생성될 대만 만들어지는 변수
	public String name; 
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	//이자율이 모두 같다 = static / 각가 다르다 (static x =instance)
	public static double interestRate;
	//상수는 대문자로 쓰는것이 관례
	//상수는 한번 정해지면 값을 변경할 수 없으므로 일반적으로 static final로 사용한다.
	public static final String BANKNAME = "신한은행"; //*모두에게 한번에 공통으로(static) 영구적으로(final) 할당.
	
	
}

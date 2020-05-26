package java_20200525;

public class ThrowDemo {
	
	
	public static double withdraw(String account, int amount) {
	throw IncorrectAccountException{	
		
		double myBalance = 10000;
		String myAccount = "123-123-123";
		
		if(myAccount.equals(account)) {
			
		}else {
			
			throw new IncorrectAccountException("잘못된 계정입니다.");
			
		}
		
		return myBalance;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		double balance = 0;
		
		balance = withdraw("123-123-123",1000000);
		
		System.out.printf("잔고 : %f%n", balance);
	}
}

package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("syh1011","1111","sy@gilab.org",1);
		//a.id = "syh1011"; //id가 pivate 이기때문에 접근 불가.
		//a.setId("syh1011");
		//a.setPwd("1111");
		//a.setEmail("syh@gbilab.org");
		//a.setLevel(1);
		
		//*String id = a.getId();
		//*System.out.println(a.getId()); 2줄로 해서 변수로 받는 이유는 (id)밑에서 재사용 하려고 
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		Admin a1 = new Admin("syh2022","2222","test@test.com");
		
		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());
		
		
	}
}

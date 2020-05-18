package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		
		//1. 유니코드 표현
		char c1 = '\uC774';
		char c2 = '\uC194';
		System.out.print(c1);
		System.out.print(c2);

		
		//2. 아스키코드 표현
		// 48 - 57 => 0-9
		// 65 - 90 => A-Z
		// 97 - 122 => a-z
		
		char c4 = 97;
		System.out.println(c4);
		
		//3. 문자 표현법
		char c5 = '이';
		System.out.println(c5);
		
		//홀따옴표, 역슬래쉬 표시하기
		char c6 = '\'';
		char c7 = '\\';
		char c8 = '\"';
		String s9 = "\\";
		String s10 = "\"";
		String s11 = "\'";
		
		//이거 놓쳤어 ㅠㅠ System.out.println("aa"+)
		
	}

}

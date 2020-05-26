package java_20200526;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		System.out.print("입력하세요>");
		InputStream in = System.in;//표준 입력장치(키보드)와 연결
		byte[] b = new byte[100];
		try {
			//in.read(b) : 입력을 기다리고 있다, 키보드입력중에 enter치면 
			//키보드에 입력한 데이터를 b에 저장시킨다.
			int readByteCount = in.read(b);
			String str = new String(b,0,readByteCount);
			System.out.println(str);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

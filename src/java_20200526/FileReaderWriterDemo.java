package java_20200526;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("c:\\dev\\FileDemo.java");
			fw = new FileWriter("c:\\dev\\FileDemo2.java");
			/*
			int readChar = 0;
			while((readChar = fr.read()) != -1) {
				//System.out.write((char)readChar); // 표준출력장치(모니터)로 출력
				fw.write(readChar);//파일로 출력
			}
			*/
			int readCharCount = 0;
			char[] readChars = new char[1024];
			while((readCharCount = fr.read(readChars)) != -1) {
				fw.write(readChars, 0, readCharCount);
				System.out.print(new String(readChars,0,readCharCount));
				//위에꺼 잘 외우자~~~ byte랑 char차이 뿐 거의 동일!!
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) fr.close();
				if (fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
	}
}
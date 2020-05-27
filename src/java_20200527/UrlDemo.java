package java_20200527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://gdimg.gmarket.co.kr/1803177701/still/300.");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();

		System.out.println("protocol : " + protocol);
		System.out.println("host : " + host);
		System.out.println("port : " + port);
		System.out.println("path : " + path);
		System.out.println("query : " + query);
		System.out.println("reference : " + reference);
		/*
		 * 텍스트 출력 시 쓰는 OutputStream
		 * 도메인주소 : "http://corners.gmarket.co.kr/Bestsellers?ItemId=1803177701#1803177701"
		InputStream in = url.openStream();//html 정보가 들어있음.
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
		
		in.close();
		isr.close();
		br.close();
		*/
		
		//이미지 출력 시 ! 
		
}
}

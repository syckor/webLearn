package network1.basic;
/*
 * 네트워킹(통신)
 * 	- protocol : 통신상의 규칙
 * 		- 이론 OSI 7계층
 *  	- IP(Internet Protocol)
 *  		' TCP(Transfer Control Protocol) //Data를 정확히 보낼 때 씀 대신 느릴 수 있음 //열차를 통째로 보내고 도착하면 확인 
 *  		' UDP(User Datagram Protocol)    //Data를 정확하지 않음(동영상을 보낼때, 모든 픽셀을 정확히 보낼 수 없음 ) 열차를 칸마다 쪼개서 막보냄 
 *  	- HTTP/ SMTP / FTP .....
 *  
 *  - 통신을 할 때 기본사항
 *  	[클라이언트(나)]	[서버(너)]
 * 		TCP이면      		TCP여야함
 * 		내주소 	 		지주소
 * 		내포트번호		 	지포트번호
 * 		상태주소(*)	 	내주소
 * 		상대포트번호 (*)		내포트번호(*) 를 다 알고 있어야함
 *    이게 지켜져야 통신이 가능함
 *    
 *  - 포트번호 (0~65535)
 *  	0:사용안함
 *  	1~1023 : 시스템이 사용
 *  	1024~  : 사용자포트
 *    	
 *    <서버>
 *    1. serverSocket생성(포트번호)
 *    2.클라이언트가 접속할때까지 대기
 *    접속하면 소켓을 생성
 *    Socket s = ss.accept()
 *    3.입출력 스트림 얻어오기
 *    4.읽고쓰기
 *    5.닫기
 *    
 *    <클라이언트>
 *    1.Socket생성(IP서버, 서버포트)
 *    2.입출력 스트림 얻어오기
 *    3.읽고쓰기
 *    4.닫기
 *    
 */	    



import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleClient {
	
	public final static int PORT = 5000; //포트를 맞춰줘야함
	public final static String HOST = "192.168.0.55"; //컴퓨터 찾는거
	
	public static void main( String args[] ) {
		
		Socket client = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		
		// 콘솔 입력을 받기 위해
		Scanner stdin = new Scanner( System.in );
		

		try{ 
					
		// 1. 서버에 연결하기 위해 소켓 생성
		client = new Socket(HOST, PORT); 
		
		
		
		// 2. 소켓의 입출력 스트림 얻기
		in = new DataInputStream(client.getInputStream());	
		out = new DataOutputStream(client.getOutputStream());//소켓을 통해  출력
		
		// 3. 키보드 입력 받아 서버에 전송
	
		System.out.println("짜꿍에게 인삿말을");
		out.writeUTF(stdin.nextLine()); //바로 라이팅 서버에서 읽을거임
				
		// 4. 서버로부터 응답을 받음
		
		System.out.println(in.readUTF());
	
		
		// 5. 입출력 스트림의 닫음
		in.close();
		out.close();
		client.close(); //소켓을 나중에 닫아야함
			
			
		} catch ( Exception ex ) {
			System.out.println("Error writing.." + ex );	
		}
	}	
}
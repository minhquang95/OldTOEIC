import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Client {
	public String put(){
		Scanner sc = new Scanner  (System.in);
		System.out.println("Hãy nhập tên đăng nhập");
		String users = sc.next();
		return users;
	}
	
	
	public void connect(){
		try {
			SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			
			
			SSLSocket socket = (SSLSocket) factory.createSocket("localhost", 1995);
			String [] suppported = socket.getSupportedCipherSuites();
			socket.setEnabledCipherSuites(suppported);
			
			PrintStream pw = new PrintStream(socket.getOutputStream());
			String users = put();
			pw.print(users);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String user = br.readLine();
			
			if(user != null){
				System.out.println("Đã nhận từ Client");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String [] args){
		Client c = new Client();
		c.connect();
	}
	
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ssl.SSLServerSocket;

public class Sever {
	String name = "Minh Quang";
	
	public void serve(){
		try {
			
			System.out.println("Sever is Ready");
			ServerSocket sever = new ServerSocket(1995);
			Socket connection = sever.accept();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String users = br.readLine();
			
			if (users.equals(name)){
				PrintStream pw = new PrintStream(connection.getOutputStream());
				pw.print("Mât khẩu đúng");
				
			} else {
				PrintStream pw = new PrintStream(connection.getOutputStream());
				pw.print("Mât khẩu sai");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String [] args){
		Sever s = new Sever();
		s.serve();;
	}
	
}

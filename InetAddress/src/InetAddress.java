import java.net.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
public class InetAddress {
	public static void main(String [] args){
		try {
//			byte[] address = {107, 23, (byte) 216 , (byte) 196 };
//			Inet4Address lessWrong = (Inet4Address) Inet4Address.getByAddress(address);
//			Inet4Address LessWrongWithName = (Inet4Address) Inet4Address.getByAddress("www.zing.vn",address);
//			Inet4Address pc = (Inet4Address) Inet4Address.getLocalHost();
//			System.out.println(pc);
//			System.out.println(lessWrong);
//			Inet4Address ia = (Inet4Address) Inet4Address.getByName("www.zing.vn");
//			System.out.println(ia);
			Inet4Address ia = (Inet4Address) Inet4Address.getByName(args[0]);
//			System.out.println(ia.getCanonicalHostName());
			if(ia.isLoopbackAddress()){
				System.out.println(ia+"ia");
			}
		} catch (Exception e) {
		
			// TODO: handle exception
		}
		
	}
}

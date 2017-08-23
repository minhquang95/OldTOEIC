package Sever;

public class Process {
	public boolean Check (String userCheck, String passCheck){

	if(userCheck.equals("MinhQuang")&& (passCheck.equals("1234"))){
		return true;
	}
		return false;
	}	
	
	public boolean CheckImage (String userCheck, String passCheck){

		if(userCheck.equals("Quang")&& (passCheck.equals("1234"))){
			return true;
		}
			return false;
		}	
}

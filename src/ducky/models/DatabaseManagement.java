package ducky.models;

/**
 * Created by KV on 16/12/2016.
 */

public class DatabaseManagement{
	public boolean checkUser(String username, String password){
		if(username.equals("Ducky") && password.equals("FunnyGuy")){
			return true;
		}else{
			return false;
		}
	}
}

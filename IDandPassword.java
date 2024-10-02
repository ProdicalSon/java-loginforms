import java.util.HashMap;

public class IDandPassword {
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	void IDandPasswords(){
		logininfo.put("Bro", "Pizza");
		logininfo.put("John", "PASSWORD");
		logininfo.put("brian", "abc123");
	}
	 
	protected HashMap getLogininfo(){
		return logininfo;
	}

}


package swathi.socialmediawebservice.database;

import java.util.HashMap;
import java.util.Map;

import swathi.socialmediawebservice.model.Messages;
import swathi.socialmediawebservice.model.Profile;

public class Database {
	private static Map<Long , Messages> messages = new HashMap<Long , Messages>();
	private static Map<String , Profile> profiles = new HashMap<String , Profile>();
	
	public static Map<Long , Messages> getMessages(){
		
		return messages;
	}
	
public static Map<String , Profile> getProfiles(){
		
		return profiles;
	}
	
}

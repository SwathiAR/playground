package swathi.socialmediawebservice.service;

import java.util.ArrayList;
import java.util.Map;

import swathi.socialmediawebservice.database.Database;
import swathi.socialmediawebservice.model.Messages;
import swathi.socialmediawebservice.model.Profile;

public class ProfileService {
	
        Map<String , Profile> mapOfProfiles = Database.getProfiles();

	public ProfileService(){
		mapOfProfiles.put("swathi" , new Profile(1L , "swathi","Swathi" ,"Bhat"));
		mapOfProfiles.put("chethan" , new Profile(2L , "chethan" ,"Chethan" ,"Prakash"));

	}
	
	public ArrayList<Profile> getAllProfiles(){
		return new ArrayList<Profile>(mapOfProfiles.values());
	}


	public Profile getProfile(String profileName){
		return mapOfProfiles.get(profileName);
		
	}
		
	public Profile addProfile(Profile profile){
		profile.setId(mapOfProfiles.size() + 1);
		 mapOfProfiles.put(profile.getProfileName(), profile);
		return profile;
	}
		
	public Profile updateProfile(Profile profile){
		if(profile.getProfileName().isEmpty())
		{
			return null;
		}
		return mapOfProfiles.put(profile.getProfileName(),profile);
	}
	
	public Profile deleteProfile(String profileName){
		return mapOfProfiles.remove(profileName);
	}
	}
	



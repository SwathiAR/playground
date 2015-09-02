 package swathi.socialmediawebservice.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import swathi.socialmediawebservice.database.Database;
import swathi.socialmediawebservice.model.Messages;

public class MessageService {
	
	private Map<Long , Messages> mapOfAllMessages = Database.getMessages();

	public MessageService(){
		mapOfAllMessages.put(1L , new Messages(1 , "Flying to US " ,"Swathi" ));
		mapOfAllMessages.put(2L , new Messages( 2 , "First Day at San Jose" , "Swathi"));
		
	}

	public List<Messages> geAlltMessages(){
		return new ArrayList<Messages > (mapOfAllMessages.values());
	}

    public List<Messages> getAllMessages(int year){
        List<Messages> messagesList = new ArrayList<Messages>();
        Calendar cal = Calendar.getInstance();
        for (Messages message : mapOfAllMessages.values()) {
            cal.setTime(message.getDate());
            if(cal.get(Calendar.YEAR)==year){
                messagesList.add(message);
            }
        }
        return messagesList;
    }

    public List<Messages> getAllMessages(int start ,int size){
        List<Messages> messagesList = new ArrayList<Messages>(mapOfAllMessages.values());
        if(start +size > messagesList.size()){return new ArrayList<Messages>();}
        return messagesList.subList(start , size+start);
        }


	public Messages getMessage(Long id){
		return mapOfAllMessages.get(id);	
	}
	
    public Messages addMessage(Messages message ){
    	message.setId(mapOfAllMessages.size() + 1);
    	mapOfAllMessages.put(message.getId(), message);
    	
    	return message;	
    }
    
    public Messages updateMessage(Messages message){
    	if(message.getId() <= 0){
    		return null;
    	}
    	mapOfAllMessages.put(message.getId() , message);
    	return message;
    	
    }
    public Messages deleteMessage(Long id){
    	return mapOfAllMessages.remove(id);	
    }
}

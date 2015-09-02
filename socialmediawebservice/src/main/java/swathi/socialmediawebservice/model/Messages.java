package swathi.socialmediawebservice.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement

public class Messages {
	
	private long id;
	private String message;
	private String author;
	private Date date;




	private Map<Long , Comments> commentsMap = new HashMap<Long,Comments>();
	
	public Messages(){
		
	}
	
	public Messages(long id, String message, String author) {
		
		this.id = id;
		this.message = message;
		this.author = author;
		this.date = new Date();

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


	@XmlTransient
	public Map<Long, Comments> getCommentsMap() {
		return commentsMap;
	}

	public void setCommentsMap(Map<Long, Comments> commentsMap) {
		this.commentsMap = commentsMap;
	}

}

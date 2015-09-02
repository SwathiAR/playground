package swathi.socialmediawebservice.service;

import swathi.socialmediawebservice.database.Database;
import swathi.socialmediawebservice.model.Comments;
import swathi.socialmediawebservice.model.Messages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by swathi on 6/22/2015.
 */
public class CommentService {

    Map<Long , Messages> messagesMap = Database.getMessages();

    public List<Comments> getAllComments(long messageId){
        Map<Long, Comments> commentsMap = messagesMap.get(messageId).getCommentsMap();
        return  new ArrayList<Comments>(commentsMap.values());
    }

    public  Comments getComment(long messageId , long commentID){
        Map<Long, Comments> commentsMap = messagesMap.get(messageId).getCommentsMap();
        return  commentsMap.get(commentID);

    }

    public Comments addComment(long messageid ,Comments comment){
        Map<Long, Comments> commentsMap = messagesMap.get(messageid).getCommentsMap();
        comment.setId(commentsMap.size() +1);
       return commentsMap.put(comment.getId() , comment);
    }

    public Comments updateComment(long messageId , Comments comment) {
        Map<Long, Comments> comments = messagesMap.get(messageId).getCommentsMap();
        if (comment.getId() <= 0) {
            return null;
        }
        return comments.put(comment.getId(), comment);
    }

    public Comments deleteComment(long mesageId , long commentId){


        Map<Long, Comments> comments = messagesMap.get(mesageId).getCommentsMap();

        return comments.remove(commentId);
    }
    }











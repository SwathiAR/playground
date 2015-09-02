package swathi.socialmediawebservice.resource;

import swathi.socialmediawebservice.model.Comments;
import swathi.socialmediawebservice.service.CommentService;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * Created by swathi on 6/22/2015.
 */

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {

private CommentService commentService = new CommentService();

    @GET
    public List<Comments> getAllComments(@PathParam("messageID") long messageId){

        return  commentService.getAllComments(messageId);
    }

    @GET
    @Path("/{commentId}")
    public Comments getComment(@PathParam("messageID") long messageID , @PathParam("commentId") long commentId){
       return commentService.getComment(messageID ,commentId);
    }

    @POST
    public Response postComment(@Context UriInfo uriInfo ,@PathParam("messageID") long messageID , Comments comment ){
        String id = String.valueOf(comment.getId());
        URI location = uriInfo.getAbsolutePathBuilder().path(id).build();
        Comments comments = commentService.addComment(messageID, comment);
        return  Response.created(location).entity(comments).build();

    }

    @PUT
    @Path("/{commentID}")
    public  Comments updateComment(@PathParam("messageID") long messageID , @PathParam("commentID") long commentID , Comments comment){
        comment.setId(commentID);
        return  commentService.updateComment(messageID , comment);
    }

    @DELETE
    @Path("/{commentID}")
    public  Comments deleteComment(@PathParam("messageID") long messageID , @PathParam("commentID") long commentID){
        return  commentService.deleteComment(messageID , commentID);
    }


}

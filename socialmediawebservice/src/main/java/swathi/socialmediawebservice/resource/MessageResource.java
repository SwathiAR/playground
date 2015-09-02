package swathi.socialmediawebservice.resource;

import java.net.URI;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import org.glassfish.jersey.server.Uri;
import swathi.socialmediawebservice.Bean.MessageFilterBean;
import swathi.socialmediawebservice.model.Comments;
import swathi.socialmediawebservice.model.Messages;
import swathi.socialmediawebservice.service.MessageService;

@Path("messages")
public class MessageResource {
    MessageService messageService = new MessageService();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Messages> getMessages(@BeanParam MessageFilterBean messageFilterBean) {
        if (messageFilterBean.getYear() > 0) {
            return messageService.getAllMessages(messageFilterBean.getYear());
        }
        if (messageFilterBean.getStart() >= 0 && messageFilterBean.getSize() > 0) {
            return messageService.getAllMessages(messageFilterBean.getStart(), messageFilterBean.getSize());
        }
        return messageService.geAlltMessages();

    }

    @GET
    @Path("/{messageID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Messages getMessages(@PathParam("messageID") Long messageId) {
        return messageService.getMessage(messageId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postMessages(@Context UriInfo uriInfo , Messages message ) {
        Messages messages = messageService.addMessage(message);
        String newId = String.valueOf(message.getId());
        URI path = uriInfo.getAbsolutePathBuilder().path(newId).build();
        return Response.created(path).entity(messages).build();
    }

    @PUT
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Messages updateMessage(@PathParam("messageId") long id, Messages message) {
        message.setId(id);
        return messageService.updateMessage(message);
    }


    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public Messages deleteMessage(@PathParam("messageId") long id) {

        return messageService.deleteMessage(id);

    }

    @Path("/{messageID}/{comments}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public CommentResource getCommentsResource() {
        return new CommentResource();
    }
}
    
   
    
    
    
    


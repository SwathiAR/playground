package swathi.socialmediawebservice.resource;

import swathi.socialmediawebservice.model.Profile;
import swathi.socialmediawebservice.service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.ArrayList;


@Path("profiles")
public class ProfileResource {
    ProfileService proileService = new ProfileService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ArrayList<Profile> getAllProfiles(){
       return proileService.getAllProfiles();
    }


    @GET
    @Path("/{profileName}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public  Profile getProfile(@PathParam("profileName") String profileName){
        return proileService.getProfile(profileName);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response addProfile(@Context UriInfo uriInfo ,Profile profile)
    {
        Profile profile1 = proileService.addProfile(profile);
        String profileName = profile.getProfileName();
        URI location = uriInfo.getAbsolutePathBuilder().path(profileName).build();
        return Response.created(location).build();
    }

    @PUT
    @Path("/{profileName}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Profile updateProfile(@PathParam("profileName") String profileName , Profile profile){
        profile.setProfileName(profileName);
        return proileService.updateProfile(profile);
        }

    @DELETE
    @Path("/{profileName}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Profile deleteProfile(@PathParam("profileName") String profileName) {
        return proileService.deleteProfile(profileName);
    }


    }





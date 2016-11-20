package com.fannie.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.fannie.beans.Message;
import com.fannie.service.MessageService;

@Path("/message")
public class MessageResource {
	
	static MessageService service = new MessageService();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message postMessage(Message message){
		return service.addMessage(message);
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Response deleteMessage(@PathParam("messageId") int messageId){
		String msg = service.deleteMessage(messageId);
		// to return the json object  
		// we are getting the string from the service
		// we can also return the text by bypassing this
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("message", msg);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(201).entity(jsonObject.toString()).build();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId")  int messageId){
		return service.getMessage(messageId);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessages(){
		return service.getAllMessages();
	}


	
	// update the message 
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message updateMessage(Message message){
		return service.updateMessage(message);
	}
	
	
	
	
	
	
	
}

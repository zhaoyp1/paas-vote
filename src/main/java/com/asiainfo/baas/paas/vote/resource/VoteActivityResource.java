package com.asiainfo.baas.paas.vote.resource;

import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.asiainfo.baas.paas.vote.model.Activity;
import com.asiainfo.baas.paas.vote.service.ActivityService;


@Singleton
@Path("/activity")
public class VoteActivityResource {
	
	@POST
	@Consumes({ "application/json", "application/xml" })
	public void postActivity(Activity activity) {

		ActivityService.createActivity(activity); 

	}
	
	@GET
	@Path("/list")
	@Produces({ "application/json", "application/xml" })
	public List<Activity> getActivities() {
		List<Activity> activities = ActivityService.getActivities();
		return activities;
	}
	
}

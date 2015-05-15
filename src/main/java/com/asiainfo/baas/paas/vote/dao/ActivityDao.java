package com.asiainfo.baas.paas.vote.dao;

import java.util.ArrayList;
import java.util.List;

import com.asiainfo.baas.paas.vote.model.Activity;

public class ActivityDao {
	
	public static void createActivity(Activity activity) {
		//
	}
	
	public static void deleteActivityById(String id) {
		//
	}
	
	public static void updateActivity(Activity activity) {
		//
	}
	
	public static Activity getActivityById(String id) {
		return new Activity("id1", "title1", "type1");
	}
	
	public static List<Activity> getActivities() {
		List<Activity> list = new ArrayList<Activity> ();
		list.add(new Activity("id1", "title1", "type1"));
		list.add(new Activity("id2", "title2", "type2"));
		return list;
	}
	
}

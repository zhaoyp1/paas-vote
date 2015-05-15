package com.asiainfo.baas.paas.vote.service;

import java.util.List;

import com.asiainfo.baas.paas.vote.dao.ActivityDao;
import com.asiainfo.baas.paas.vote.model.Activity;

public class ActivityService {
	
	public static void createActivity(Activity activity) {
		ActivityDao.createActivity(activity);
	}
	
	public static void deleteActivityById(String id) {
		ActivityDao.deleteActivityById(id);
	}
	
	public static void updateActivity(Activity activity) {
		ActivityDao.updateActivity(activity);
	}
	
	public static Activity getActivityById(String id) {
		return ActivityDao.getActivityById(id);
	}
	
	public static List<Activity> getActivities() {
		return ActivityDao.getActivities();
	}
}

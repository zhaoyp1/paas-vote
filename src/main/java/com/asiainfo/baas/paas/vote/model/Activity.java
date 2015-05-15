package com.asiainfo.baas.paas.vote.model;

import java.io.Serializable;

public class Activity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String title;
	private String type;
	
	public Activity(){}
	
	public Activity(String id, String title, String type) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	} 

}

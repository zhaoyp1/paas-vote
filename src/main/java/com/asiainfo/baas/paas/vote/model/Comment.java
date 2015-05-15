package com.asiainfo.baas.paas.vote.model;

import java.io.Serializable;

public class Comment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public int id;
	private int activeId;
	/**
	 * ÆÀÂÛ
	 */
	private String content;
	private int parentId;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActiveId() {
		return this.activeId;
	}

	public void setActiveId(int activeId) {
		this.activeId = activeId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

}
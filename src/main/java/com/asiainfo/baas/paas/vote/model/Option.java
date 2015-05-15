package com.asiainfo.baas.paas.vote.model;

import java.io.Serializable;

/**
 * 选项信息
 */
public class Option implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 选项编号
	 */
	private int id;
	/**
	 * 选项
	 */
	private String content;
	/**
	 * 活动ID
	 */
	private int activeId;
	/**
	 * 选项顺序
	 */
	private int sno;
	/**
	 * 0有效 1无效
	 */
	private int status;

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

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
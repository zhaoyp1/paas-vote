package com.asiainfo.baas.paas.vote.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 活动信息表
 */
public class VoteActivity implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 活动ID
	 */
	private int id;
	/**
	 * 活动标题
	 */
	private String title;
	/**
	 * 活动类型（单选，多选）
	 */
	private String type;
	private Date expireDate;
	private Date createDate;
	/**
	 * 投票数量限制（0无限制 ）
	 */
	private int amoutLimit;
	/**
	 * 状态（1开启 2关闭）
	 */
	private String status;
	/**
	 * 发布者
	 */
	private String ip;
	private List<Option> attribute;
	private List<Option> options;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getAmoutLimit() {
		return this.amoutLimit;
	}

	public void setAmoutLimit(int amoutLimit) {
		this.amoutLimit = amoutLimit;
	}

	public List<Option> getAttribute() {
		return this.attribute;
	}

	public void setAttribute(List<Option> options) {
		this.attribute = options;
	}

	public List<Option> getOptions() {
		return this.options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

}
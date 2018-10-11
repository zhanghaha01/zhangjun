package com.yidu.bean;

import java.util.List;

public class MenuBean {
	private String menuId;
	private String title;
	private int state;
	private String menuUrl;
	private String menuPid;
	private String menuLog;
	private int roleId;
	public MenuBean() {
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public String getMenuPid() {
		return menuPid;
	}
	public void setMenuPid(String menuPid) {
		this.menuPid = menuPid;
	}
	public String getMenuLog() {
		return menuLog;
	}
	public void setMenuLog(String menuLog) {
		this.menuLog = menuLog;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public MenuBean(String menuId, String title, int state, String menuUrl, String menuPid, String menuLog) {
		super();
		this.menuId = menuId;
		this.title = title;
		this.state = state;
		this.menuUrl = menuUrl;
		this.menuPid = menuPid;
		this.menuLog = menuLog;
	}
	public MenuBean(String menuId, String title, int state, String menuUrl, String menuPid, String menuLog,
			int roleId) {
		super();
		this.menuId = menuId;
		this.title = title;
		this.state = state;
		this.menuUrl = menuUrl;
		this.menuPid = menuPid;
		this.menuLog = menuLog;
		this.roleId = roleId;
	}
	
}

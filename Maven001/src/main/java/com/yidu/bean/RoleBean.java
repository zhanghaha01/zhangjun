package com.yidu.bean;

import java.util.List;

public class RoleBean {
	private int roleId;
	private String roleName;
	private List<MenuBean> menuList;
	public List<MenuBean> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<MenuBean> menuList) {
		this.menuList = menuList;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public RoleBean(int roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}
	public RoleBean() {
	}
}

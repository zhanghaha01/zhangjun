package com.yidu.dao;

import java.util.List;

import com.yidu.bean.RoleBean;
import com.yidu.bean.UserBean;

public interface RoleDao {
	public RoleBean selectRoleIdByUserId(UserBean u);
	public List<RoleBean> selectByRoleId(UserBean u);
}
